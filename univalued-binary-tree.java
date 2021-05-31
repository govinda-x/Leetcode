class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null || (root.left==null && root.right==null)) return true;
        int val = root.val;
        return find(root,val);
    }
    public boolean find(TreeNode root, int val){
        if(root == null) return true;
        
        if(root.val!=val) return false;
        return find(root.left,val) && find(root.right,val);
        
    }
}