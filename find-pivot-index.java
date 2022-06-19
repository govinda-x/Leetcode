class Solution {
    public int pivotIndex(int[] nums) {
        int s=0, lSum=0;
        for(int i: nums) s+=i;
        for(int i=0; i<nums.length; i++){
            if(lSum == (s - lSum - nums[i])) return i;
            lSum+=nums[i];
        }
        return -1;
    }
}