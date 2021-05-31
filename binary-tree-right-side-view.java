class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ans.add(root.val);
        while(!q.isEmpty()){
            int count = q.size();
            int last_val = 0;
            while(count>0){
                TreeNode node = q.peek();
                q.remove();
                if(node.left!=null){
                    q.add(node.left);
                    last_val = node.left.val;
                }
                if(node.right!=null) {
                    q.add(node.right);
                    last_val = node.right.val;
                }
                count--;
            }
            if(q.size()!=0) ans.add(last_val);
        }
        return ans;
    }
}