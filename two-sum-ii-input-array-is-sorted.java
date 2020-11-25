class Solution {
    public int[] twoSum(int[] A, int target) 
    {
        int [] ans = new int[2];
        int i=0 , j=A.length-1;
        while(i<j)
        {
            if(A[i]+A[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(A[i]+A[j]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return ans;
    }
}
