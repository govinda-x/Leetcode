class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }
        s = s.toLowerCase();
        String[] tokens=s.split("[\\s\\W\\.\\'\\?\\,\\_\\@]+");
        StringBuilder ss = new StringBuilder();
        for(int i=0; i<tokens.length; i++){
            ss.append(tokens[i]);
        }
        
        String o = ss.toString();
        String r = ss.reverse().toString();
        return r.equals(o);
    }
}