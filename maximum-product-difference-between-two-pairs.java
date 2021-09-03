class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[0], b= nums[1] , c = nums[n-2] , d= nums[n-1];
        return ((c*d)-(a*b));
    }
}