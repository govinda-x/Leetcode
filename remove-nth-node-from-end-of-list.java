class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        if(head==null){
            return null;
        }
        if(head.next==null){
            if(n==1){
                return null;
            }
            return head;
        }
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(n>=count){
            return head.next;
        }
        temp = head;
        for(int i=1; i<=count-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}