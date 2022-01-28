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
    public int pairSum(ListNode head) {
        Deque<Integer> d = new LinkedList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            d.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        while(!d.isEmpty()){
            int sum = d.pollFirst() + d.pollLast();
            max = Math.max(max, sum);
        }
        return max;
    }
}