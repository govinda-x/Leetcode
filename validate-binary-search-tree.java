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
    public boolean isValidBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);        
        for(int i=1;i<list.size(); i++){
            if(list.get(i-1)>=list.get(i)) return false;
        }
        return true;
    }
    private void inOrder(TreeNode root, List list){
        if(root!=null){
            inOrder(root.left,list); 
            list.add(root.val);            
            inOrder(root.right,list);  
        }            
        return;
    }
}
   