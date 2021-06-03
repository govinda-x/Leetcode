class Solution {
    public TreeNode buildTree(int[] in, int[] pos) {
        return bt(in , pos, 0 , in.length-1, 0 , pos.length-1);
    }
    public TreeNode bt(int [] in, int [] pos, int in_s, int  in_e, int pos_s, int pos_e){
        if(in_s>in_e) return null;
        int val = pos[pos_e];
        TreeNode root = new TreeNode(val);
        int i;
        for(i=in_s; i<=in_e; i++){
            if(in[i] == val) break;
        }
        int r = i- in_s + pos_s -1;
        root.left = bt(in, pos, in_s, i-1, pos_s , r);
        root.right = bt(in, pos, i+1 , in_e, r+1, pos_e-1);
        return root;
    }
}