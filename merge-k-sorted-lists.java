class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        if(n == 1) return lists[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode temp : lists){
            while(temp!=null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode ans = new ListNode(0), temp = ans;
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.remove());
            temp = temp.next;
        }
        temp.next =null;
        return ans.next;   
    }
} 