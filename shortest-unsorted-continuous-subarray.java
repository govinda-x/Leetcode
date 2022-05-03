class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int a[] = nums.clone();
        Arrays.sort(a);
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i] == a[i]) i++;
            else if (nums[j] == a[j]) j--;
            else break;
        }
        if(i==j) return 0;
        return j-i+1;
    }
}