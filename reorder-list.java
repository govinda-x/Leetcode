class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode start = head.next, ans = head, tail =ans;
        Deque<ListNode> q = new LinkedList<ListNode>();
        while(start!=null){
            q.add(start);
            start = start.next;
        }
        int front = 0;
        while(!q.isEmpty()){
            if(front==-1){
                front =0;
                tail.next = q.getFirst();
                tail = tail.next;
                q.removeFirst();
            }
            else{
                front = -1;
                tail.next = q.getLast();
                tail = tail.next;
                q.removeLast();
            }
        }
        tail.next = null;
        head =  ans;
        
    }
}