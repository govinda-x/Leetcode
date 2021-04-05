class Solution {
    public void sortColors(int[] nums) {
        if(nums.length <=1){
            return;
        }
        int zero = 0, two = nums.length-1;
        for(int i=0; i<=two;){
            if(nums[i]==0){
                int temp = nums[zero];
                nums[zero] = 0;
                nums[i] = temp;
                zero++;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
                two--;
            }
            else{
                i++;
            }
        }
    }
}