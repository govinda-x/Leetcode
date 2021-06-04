class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null) return list2;
        ListNode start = list1;
        int count =1;
        while(start.next!=null && count<a){
            start = start.next;
            count++;
        }
        ListNode end = start;
        while(end.next!=null && count<=b){
            end = end.next;
            count++;
        }
        end = end.next;
        start.next = list2;
        ListNode temp = list2;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = end;
        return list1;
    }
}