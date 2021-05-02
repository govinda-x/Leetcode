class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head==null)
        {
            return head;
        }
        ListNode temp=head ;
        while(temp.next!=null)
        {
            if(temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
            {
               temp=temp.next;      
            }
        }
        return head.val==val?head.next:head;
    }
}