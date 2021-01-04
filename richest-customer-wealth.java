class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int sum =0, max=0;
        for(int i=0; i<accounts.length; i++)
        {
            for(int j=0; j<accounts[0].length; j++)
            {
                sum+=accounts[i][j];
            }
            max = Math.max(sum,max);
            sum =0;
        }
        return max;
    }
}