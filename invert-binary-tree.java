class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    void invert(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}