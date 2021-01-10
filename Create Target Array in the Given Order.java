class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] ans = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        for(int i=0; i<nums.length; i++)
        {
            arr.add(index[i], nums[i]);
        }
        for(int i=0; i<nums.length; i++)
        {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}