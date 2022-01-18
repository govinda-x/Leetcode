class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]) ans.add(i);
        }
        return ans;
    }
}