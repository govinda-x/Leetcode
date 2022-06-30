class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int mid = nums[nums.length/2];
        for(int i : nums) ans+=Math.abs(i - mid);
        return ans;        
    }
}