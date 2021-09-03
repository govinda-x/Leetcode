class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i : nums){
            if(sum<=0){
                sum = i;
            }
            else{
                sum+=i;
            }
            max = max>sum?max:sum;
        }
        return max;
    }
}