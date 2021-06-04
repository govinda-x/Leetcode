class Solution {
     
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        ListNode start = head, end = head;
        for(int i=1; i<k; i++){
            start = start.next;
        }
        ListNode temp = start;
        while(temp.next!=null){
            end = end.next;
            temp = temp.next;
        }
        int value= start.val;
        start.val = end.val;
        end.val = value;
        return head;
    }
}