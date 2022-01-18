class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = -1;
        for(int i=1;i<nums.length;i++){
            min = Math.min(min,nums[i]);    
            max = Math.max(max, (nums[i]-min));
        }
        if(max<=0) return -1;
        return max;
    }
}