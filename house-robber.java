class Solution {
    public int rob(int[] nums) {
        int even=0, odd=0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                even += nums[i];
                even = Math.max(even,odd); //storing the maximum value
            }
            else{
                odd += nums[i];
                odd = Math.max(even,odd);
            } 
        }
        
        
        return even == odd ? even : Math.max(even,odd);
    }
}