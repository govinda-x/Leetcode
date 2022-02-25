class Solution {
    Stack<TreeNode> leftStack;
    Stack<TreeNode> rightStack; 
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        leftStack = new Stack();
        rightStack = new Stack();
        
        TreeNode left = root;
        while (left.left != null) {
            leftStack.push(left);
            left = left.left;
            
        }
        
        TreeNode right = root;
         while (right.right != null) {
            rightStack.push(right);
            right = right.right;
            
        }
        
        while (left != right) {
            int low = left.val;
            int high = right.val;
            if (low + high == k) return true;
            else if (low + high < k) left = getLarger(left);
            else right = getSmaller(right);
        }
        
        return false;
    }
    
    TreeNode getLarger(TreeNode left) {
        left = left.right;
        if (left == null) {
            if (!leftStack.isEmpty()) return leftStack.pop();
            else return null;
        } else {
             while (left != null) {
            leftStack.push(left);
            left = left.left;
          }
            return leftStack.pop();
        }
    }
    
    TreeNode getSmaller(TreeNode right) {
        right = right.left;
        if (right == null) {
            if (!rightStack.isEmpty()) return rightStack.pop();
            else return null;
        } else {
             while (right != null) {
            rightStack.push(right);
            right = right.right;
          }
            return rightStack.pop();
        }
    }
}