class Solution {
    public int balancedStringSplit(String s) {
        int c=0,l=0, r =0;
        for(int i= 0;i<s.length(); i++){
            if(s.charAt(i) == 'L') l++;
            else r++;
            
            if(l==r){
                l=0;
                r=0;
                c++;
            }
        }
        return c;
    }
}