class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i=0, j = nums.length-1;
        int sum_f=nums[i], sum_l=nums[j];
        ans.add(nums[j]);
        while(i<j){
            if(sum_f<sum_l){
                i++;
                sum_f+=nums[i];
            }
            else{
                j--;
                sum_l+=nums[j];
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}