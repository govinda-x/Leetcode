class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans  = new ArrayList<Integer>();
        if(root == null) return ans;
        postorder(root, ans);
        return ans;
    }
    void postorder(TreeNode root , List<Integer> ans){
        if(root == null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
        return;
    }
}
    