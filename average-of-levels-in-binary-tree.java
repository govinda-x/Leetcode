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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        if(root == null) {
            ans.add(0.00000);
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size(), s = q.size();
            double sum = 0;
            while(size!=0){
                TreeNode present = q.poll();
                sum+=present.val;
                if(present.left!=null) q.add(present.left);
                if(present.right!=null) q.add(present.right);
                size--;
            }
            sum=sum/s;
            ans.add(sum);
        }
        return ans;
    }
}