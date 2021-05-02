public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       ListNode temp1=headA,temp2=headB;
        while(temp1!=null||temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
        }
        return null;
    }
}