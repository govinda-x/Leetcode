class Solution {
    public String maximumTime(String time) {
        char [] t = time.toCharArray();
        
        if(t[0] == '?'){
            if(t[1] == '?' || t[1]<='3')  t[0] = '2';
            else t[0] = '1';
        }
        
        if(t[1]=='?'){
            if(t[0] <='1') t[1] = '9';
            else t[1] = '3';
        }
        
        if(t[3] == '?') t[3] ='5';

        if(t[4] == '?') t[4] = '9';
        
        return String.valueOf(t);
    }
}