class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        if(head.val!=head.next.val){
            head.next = deleteDuplicates(head.next);
            return head;
        }
        else{
            int x = head.val;
            while(head!=null && x==head.val){
                head = head.next;
            }
        }
        return deleteDuplicates(head);
    }
}