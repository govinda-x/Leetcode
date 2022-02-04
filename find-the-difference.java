class Solution {
    public char findTheDifference(String s, String t) {
        int xor =0;
        for(int i=0;i<s.length(); i++){
            int c = s.charAt(i);
            xor^=c;
        }
       for(int i=0;i<t.length(); i++){
            int c = t.charAt(i);
            xor^=c;
        }
        return (char) xor;
    }
}