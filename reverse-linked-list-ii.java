class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode first = null, start = head;
        int count =1;
        while(count<left){
            first = start;
            start=start.next;
            count++;
        }
        ListNode curr =start, prev = null, temp = null;
        while(count<=right){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
            count++;
        }
        start.next = temp;
        if(first==null){
            head=prev;
        }
        else{
            first.next = prev;
        }
        return head;
        
    }
}