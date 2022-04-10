class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0;
        int e = (int)Math.sqrt(c);
        while(s<=e){
            long current = s*s + e*e;
           if(current< c) s++;
            else if(current > c) e--;
            else return true;
        } 
        return false;
    }
}
