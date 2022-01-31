/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
   public Node connect(Node root) {
        
		if (root == null || isLeafNode(root))
			return root;
		root.left.next = root.right;
		if (root.next != null) {
			root.right.next = root.next.left;
		}
		root.left = connect(root.left);
		root.right = connect(root.right);
		return root;
	}

	boolean isLeafNode(Node root) {
		return root.left == null && root.right == null;
	}
}