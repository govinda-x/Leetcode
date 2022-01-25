class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] end = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(end, 0, nums, 0, end.length);
    }
}