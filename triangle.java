class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row-1).size();
        
        int dp[][] = new int[row][col];
        
        for(int i=0;i<col;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return traverse(triangle,0,0,dp);
    }
    
    private int traverse(List<List<Integer>> triangle,int row,int idx,int[][] dp){
        if(row>=triangle.size()){
            return 0;
        }
        
        if(row==triangle.size()){
            return triangle.get(row).get(idx);
        }
        
        if(dp[row][idx]!=Integer.MAX_VALUE){
            return dp[row][idx];
        }
        
        int ans= Integer.MAX_VALUE;
        
        ans=Math.min(ans,traverse(triangle,row+1,idx,dp));
        ans=Math.min(ans,traverse(triangle,row+1,idx+1,dp));
        
        dp[row][idx]= ans+triangle.get(row).get(idx);
        return dp[row][idx];
    }
}