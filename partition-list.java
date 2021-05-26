class Solution {
    public ListNode partition(ListNode A, int B) {
        if(A == null || A.next==null){
            return A;
        }
        ListNode small =null;
        ListNode large =null;
        ListNode smallnext =null;
        ListNode largenext =null;
        ListNode curr = A;
        while(curr!= null)
        {
            if(curr.val<B)
            {
                if(small==null)
                {
                    small=curr;
                    smallnext =small;
                }
                else
                {
                    smallnext.next = curr;
                    smallnext = smallnext.next;
                }
            }
            else
            {
                if(large == null)
                {
                    large= curr;
                    largenext = large;
                }
                else
                {
                    largenext.next = curr;
                    largenext = largenext.next;
                }
            }
            curr = curr.next;
        }
        if(small!=null)
        {
            smallnext.next = large;
            if(large==null) return small;
            largenext.next=null;
            return small;
        }
        largenext.next = null;
        return large;
    }
}