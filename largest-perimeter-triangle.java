class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length<=2) return 0;
        Arrays.sort(nums);
        for(int i= nums.length-3; i>=0; i--){
            if((nums[i] + nums[i+1]) > nums[i+2]) return nums[i] + nums[i+1] + nums[i+2];
        }
        return 0;
    }
}