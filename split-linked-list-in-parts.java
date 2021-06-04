class Solution {
    public int count(ListNode root){
        if(root==null) return 0;
        
        return 1+count(root.next);
    }
    public ListNode[] splitListToParts(ListNode root, int k) {
        
        ListNode [] ans = new ListNode[k];
        Arrays.fill(ans,null);
        if(k==1) {
            ans[0]  = root;
            return ans;
        }
        if(root == null){
            Arrays.fill(ans,null);
            return ans;
        }
        int c = count(root);
        int w  = c/k , rem  = c%k, i =0;
        ListNode curr = root;
        ListNode prev = root;
        while(curr!=null){
            ans[i++] = curr;
            int var = w;
            while(var-->0){
                prev = curr;
                curr= curr.next;
            }
            if(rem!=0){
                prev = curr;
                curr=curr.next;
                rem--;
            }
            prev.next = null;
        }
        return ans;
    }
}