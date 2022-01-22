class Solution {
    public boolean isThree(int n) {
        if(n<=3) return false;
        int c =0;
        for(int i=n; i>=1; i--){
            if(n%i==0) c++;
        }
        return c==3?true:false;
    }
}