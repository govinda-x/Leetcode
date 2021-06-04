class Solution {
    public int count(ListNode head){
        if(head == null) return 0;
        return 1+count(head.next);
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        int start = 1;
        int c = count(head);
        ListNode odd=null, oddnext=null, even=null , evennext=null;
        while(head!=null && start<=c){
            if(start%2!=0){
                if(odd == null){
                    odd = head;
                    oddnext= odd;
                }
                else{
                    oddnext.next = head;
                    oddnext = head;
                }
            }
            else{
                if(even == null){
                    even = head;
                    evennext = even;
                }
                else{
                    evennext.next = head;
                    evennext = head;
                }
            }
            head = head.next;
            start++;
        }
        oddnext.next = even;
        evennext.next = null;
        return odd;
    }
}