class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        if(A==null) return B;
        if(B==null) return A;
        ListNode head = null, tail = null;
        int carry =0, sum =0;
        while(A!=null || B!=null || carry>0){
            if(A!=null) sum+=A.val;
            if(B!=null) sum+=B.val;
            sum+=carry;
            carry = sum/10;
            sum%=10;
            ListNode newNode = new ListNode(sum);
            if(tail == null){
                head = newNode;
                tail = head;
            }
            else{
                tail.next =newNode;
                tail = newNode;
            }
            if(A!=null) A=A.next;
            if(B!=null) B=B.next;
            sum =0;
        }
        return head;
    }
}