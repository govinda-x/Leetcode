class Solution {
    public int count(ListNode root){
        if(root == null) return 0;
        return 1 + count(root.next);
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        if(head == null || head.next == null){
            return head;
        }
        
        int c = count(head);
        if(c<k) return head;
        ListNode curr = head, prev = null, temp =null;
        while(curr!=null && count<k){
            count++;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
        }
        if(temp!=null){
            head.next = reverseKGroup(temp, k);
        }
        return prev;
    }
}