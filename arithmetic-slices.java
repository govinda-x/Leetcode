class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int current=0;
        int ans=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                current++;;
                ans=ans+current;
            }
            else{
                current=0;
            }
        }
        return ans;
    }
}