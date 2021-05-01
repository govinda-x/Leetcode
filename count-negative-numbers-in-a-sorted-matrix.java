class Solution {
    public int countNegatives(int[][] grid) {
        
        int negativeCount = 0;
    
        for(int[] arr: grid)
        {
            for(int i=0; i<arr.length; i++)
            {
                //case1
                if(arr[i] < 0)
                {
                    negativeCount += arr.length;
                    break;
                }

                //case2
                int low = 0; int high = arr.length-1;                        
                while(low <= high)
                {                    
                    int mid = (low+high)/2;
                    
					//checking >= 0 because ther is '0' in one of the test case
                    if(arr[mid] >= 0)
                    {
                        low = mid+1;
                    }else {
                        negativeCount += high-mid +1;
                        high = mid-1;
                    }
                }
                break;
            }
        }
        return negativeCount;

    }
}