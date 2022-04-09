class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0 && n>=i){
            n-=i;
            i++;
        }
        return i-1;
    }
}