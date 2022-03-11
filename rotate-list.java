/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int count(ListNode head){
        if(head == null) return 0;
        return 1+count(head.next);
    }
    public ListNode rotateRight(ListNode head, int k) {
        int n = count(head);
        if(head == null || head.next==null || k == 0 || k%n==0) return head;
        k = k % n;
        ListNode ans = null, temp1 =head, temp2=null;
        int i=1;
        while(i<(n - k)){
            i++;
            temp1 = temp1.next;
        }
        ans = temp1.next;
        temp1.next =null;
        temp2 = ans;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next = head;
        return ans;
        
    }
}