class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int [] res = new int [nums.length];
        int y=0;                               
        for(int i =0;i<nums.length-1;i+=2){
            res[i]=nums[y++];
            res[i+1]=nums[n++];                 
        }
        return res;
    }
}