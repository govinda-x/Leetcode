class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(true){
            int count = q.size();
            if(count==0) break;
            int largest = Integer.MIN_VALUE;
            while(count>0){
                TreeNode node = q.poll();
                if(largest<node.val){
                    largest = node.val;
                }
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                count--;
            }
            ans.add(largest);
        }
        return ans;
    }
}