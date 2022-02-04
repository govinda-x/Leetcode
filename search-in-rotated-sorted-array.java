class Solution {
    public int search(int[] nums, int target) {
        return searchInTheArray(0, nums.length-1, nums, target);
    }
    
    private int searchInTheArray(int left, int right, int[] nums, int target){
        if(left>right) return -1;
         int mid = left + (right-left)/2;
        
        if(nums[mid] == target) return mid;
        
        return searchInTheArray(left, mid-1, nums, target) + searchInTheArray(mid+1, right, nums, target) +1;
    }
}