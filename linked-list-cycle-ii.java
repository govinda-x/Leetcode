public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)
            return null;
        
        HashSet<ListNode> s = new HashSet<ListNode>();
        while(head!=null){
            if(s.contains(head)){
                return head;
            }
            s.add(head);
            head = head.next;
        }
        return null;
        
    }
}