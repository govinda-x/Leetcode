class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int n = mat.length;
        int sum =0;
        if(n%2==0)
        {
            for(int i=0; i<n; i++)
            {
                sum+=mat[i][i];
            }
            int j=0;
            for(int i=n-1; i>=0; i--)
            {
                sum+=mat[i][j];
                j++;
            }
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                sum+=mat[i][i];
            }
            int j=0;
            for(int i=n-1; i>=0; i--)
            {
                sum+=mat[i][j];
                j++;
            }
            sum=sum - mat[n/2][n/2];
        }
        return sum;
        
    }        
}