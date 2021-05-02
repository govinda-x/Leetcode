class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        long p=1;
        for(int i=0; i<nums.length; i++){
            p*=nums[i];
            if(nums[i]<0){
                c++;
            }
            if(nums[i] == 0){
                return 0;
            }
        }
        if(c%2==0){
            return 1;
        }
        return -1;
    }
}