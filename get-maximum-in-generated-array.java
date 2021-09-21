class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0||n==1) return n;
        int max= 0;
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int i=1,c=2;
        while(c<=n){
            dp[i*2] = dp[i];
            c++;
            max = Math.max(max, dp[i*2]);
            if(c>n) break;
            dp[i*2+1] = dp[i] + dp[i+1];
            max = Math.max(max, dp[i*2+1]);
            c++;
            i++;
            
        }
        return max;
        
    }
}