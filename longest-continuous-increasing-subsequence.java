class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++){
            if (i == 0){
                count++;
            }
            else{
                if (nums[i] > nums[i-1]){
                    count++;
                }
                else{
                    max = Math.max(max,count);
                    count = 1;
                }
            }
        }  
        return Math.max(max,count);
    }
}