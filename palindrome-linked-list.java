class Solution {
    public boolean isPalindrome(ListNode head) {
        
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        int len = sb.length();
        String s = sb.toString();
        String r = sb.reverse().toString();
        return s.equals(r);
    }
}