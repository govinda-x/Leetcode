/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int val =0;
    
    public void sum(TreeNode root, int curr){
        if(root!=null){
            curr = curr<<1 | root.val;
            if(root.right ==null && root.left==null) {
                val+=curr;
            }
            sum(root.left, curr);
            sum(root.right, curr);
        }
    }
    
    public int sumRootToLeaf(TreeNode root) {
        
        if(root == null) return 0;
        if(root.right ==null && root.left==null) return root.val;
        sum(root, 0);
        return val;
        
        
    }
}