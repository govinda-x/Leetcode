class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null || (root.left==null && root.right==null)) return root;
        ArrayList<Integer> ans = inorder(root);
        TreeNode head = new TreeNode(ans.get(0)) , tail = head;
        tail.left = null;
        for(int i=1; i<ans.size(); i++){
            TreeNode node = new TreeNode(ans.get(i));
            tail.right = node;
            tail = node;
        }
        return head;
    }
    public ArrayList<Integer> inorder(TreeNode A){
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(A == null){
            return ans;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        while(A!=null || !s.isEmpty()){
            while(A!=null){
                s.push(A);
                A=A.left;
            }
            A=s.peek();
            s.pop();
            ans.add(A.val);
            A = A.right;
        }
        return ans;
    }
}