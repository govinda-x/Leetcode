class Solution {
    public boolean backspaceCompare(String s, String t) {
        return remove(s).equals(remove(t));
    }
    public String remove(String a){
        Stack<Character> ans = new Stack();
        for (char c: a.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}