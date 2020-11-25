class Solution {
    public int maxArea(int[] A) 
    {
        if(A.length == 1)
        {
            return 0;
        }
        int max_area = Integer.MIN_VALUE;
        int i =0, j= A.length-1;
        while(i<j)
        {
            int area = Math.min(A[i],A[j])*(j-i);
            max_area = Math.max(max_area,area);
            
            if(A[i]>A[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        return max_area;
    }
}
