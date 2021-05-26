class Solution {
    public ListNode reverse(ListNode head){
        if(head==null || head.next == null){
            return head;
        }
        ListNode temp = null, curr = head, prev = null;
        while(curr!=null){
            temp = curr.next;
            curr.next= prev;
            prev = curr;
            curr= temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode A = reverse(l1);
        ListNode B = reverse(l2);
        ListNode head = null, tail=null;
        int carry = 0, sum=0;
        while(A!=null || B!=null || carry>0){
            if(A!=null) sum+=A.val;
            if(B!=null) sum+=B.val;
            sum+=carry;
            carry = sum/10;
            sum%=10;
            ListNode newNode = new ListNode(sum);
            if(tail==null){
                head = newNode;
                tail =head;
            }
            else{
                tail.next= newNode;
                tail = newNode;
            }
            if(A!=null) A=A.next;
            if(B!=null) B=B.next;
            sum=0;
        }
        ListNode ans = reverse(head);
        return ans;
    }
}