class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(true){
            int count = q.size();
            if(count==0) break;
            List<Integer> cols = new ArrayList<>();
            while(count>0){
                TreeNode node = q.poll();
                cols.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                count--;
            }
            ans.add(cols);
        }
        return ans;
    }
}