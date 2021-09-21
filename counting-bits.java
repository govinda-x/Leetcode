class Solution {
    public int[] countBits(int n) {
        if(n==0) return new int[]{0};
        if(n==1) return new int[]{0,1};
        
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        dp[2] =1;
        int p =1;
        for(int i=3; i<=n; i++){
            if(i == Math.pow(2,p+1)){
                dp[i]=1;
                p++;
            }
            else{
                dp[i] = dp[i-(int)Math.pow(2,p)]+1;
            }
        }
        return dp;
    }
}