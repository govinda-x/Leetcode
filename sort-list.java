class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public ListNode middle(ListNode head){
        if(head==null|| head.next==null){
            return head;
        }
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = middle(head);
        ListNode nH = temp.next;
        temp.next = null;
        ListNode A = mergeSort(head);
        ListNode B = mergeSort(nH);
        ListNode ans = merge(A,B);
        return ans;
    }
    public ListNode merge(ListNode A, ListNode B){
        ListNode result = new ListNode(0);
        ListNode tail = result;
        while(A!=null && B!=null){
            if(A.val<=B.val){
                tail.next = A;
                A=A.next;
            }
            else{
                tail.next = B;
                B= B.next;
            }
            tail = tail.next;
        }
        if(A!=null) tail.next = A;
        if(B!=null) tail.next = B;
        return result.next;
    }
}