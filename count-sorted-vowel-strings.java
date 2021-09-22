class Solution {
    public int countVowelStrings(int n) {
        int [] dp = {1,1,1,1,1};
        while(n>0){
            for(int i=1;i<5;i++){
                dp[i]+=dp[i-1];
            }
            n--;
        }
        return dp[4];
    }
}