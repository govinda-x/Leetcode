class Solution {
    public boolean hasPathSum(TreeNode root, int b) {
        if(root == null) return false;
        if(root.val == b && (root.left == null && root.right == null)) return true;
        
        if(hasPathSum(root.left, b - root.val) || hasPathSum(root.right, b-root.val)) return true;
        return false;
    }
}