class Solution {
    public TreeNode buildTree(int[] pre, int[] in) {
        return bt(pre, in, 0, pre.length-1, 0 , in.length-1);
    }
    public TreeNode bt(int [] pre, int [] in , int in_s, int in_e, int pre_s, int pre_e){
        
        if(in_s>in_e) return null;
        int val = pre[pre_s];
        TreeNode root = new TreeNode(val);
        int i;
        for(i=in_s; i<=in_e; i++){
            if(in[i] == val) break;
        }
        int r = i - in_s + pre_s;
        root.left = bt(pre, in, in_s, i-1 , pre_s+1, r);
        root.right = bt(pre, in, i+1, in_e , r+1, pre_e );
        return root;
    }
}