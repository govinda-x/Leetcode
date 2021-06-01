class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        inorder(root, ans);
        return ans.get(k-1);
    }
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null) return;
        
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
        return;
    }
}