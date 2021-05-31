class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root1==null && root2==null) return ans;
        
        inorder(root1, ans);
        inorder(root2, ans);
        Collections.sort(ans);
        return ans;
    }
    public void inorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
        return;
    }
}