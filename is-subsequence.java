class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        
        if(s.length() == t.length()){
            if(s.equals(t)){
                return true;
            }
            else{
                return false;
            }
        }
        if(s.length()==0){
            return true;
        }
        int ind =0;
        for(int i =0; i<t.length(); i++) 
        {
            if(ind<s.length() && s.charAt(ind)==t.charAt(i)){
                ind++;
            }
        }
        if(ind == s.length()){
            return true;
        }
        return false;
    }
}