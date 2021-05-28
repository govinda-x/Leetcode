class Solution {
    Node create(int val){
        Node temp = new Node(val);
        return temp;
    }
    public Node copyRandomList(Node A) {
        if(A==null) return null;
        HashMap<Node, Node> h = new HashMap<Node ,Node>();
        Node head = new Node(A.val);
        Node ptr1 = A, ptr2 = head;
        h.put(ptr1, ptr2);
        ptr1 = ptr1.next;
        Node temp;
        while(ptr1!=null){
            temp = create(ptr1.val);
            ptr2.next = temp;
            ptr2 = temp;
            h.put(ptr1 , ptr2);
            ptr1=ptr1.next;
        }
        ptr1 = A;
        ptr2 = head;
        while(ptr1!=null){
            temp = ptr1.random;
            ptr2.random = h.get(temp);
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        return head;
    }
}