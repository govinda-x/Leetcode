/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root!=null && p.val<root.val && q.val<root.val){
            root = lowestCommonAncestor(root.left,p,q);
        }
        if(root!=null && p.val>root.val && q.val>root.val){
            root = lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}