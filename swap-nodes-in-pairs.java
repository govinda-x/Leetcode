class Solution {
    public ListNode swapPairs(ListNode head) {
        int count =0;
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = null, prev = null, curr = head;
        while(curr!=null && count<2){
            count++;
            temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr =temp;
        }
        if(curr!=null){
            head.next = swapPairs(curr);
        }
        return prev;
    }
}