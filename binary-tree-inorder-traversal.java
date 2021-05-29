class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans  = new ArrayList<Integer>();
        if(root == null) return ans;
        inorder(root, ans);
        return ans;
    }
    void inorder(TreeNode root , List<Integer> ans){
        if(root == null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        return;
    }
}