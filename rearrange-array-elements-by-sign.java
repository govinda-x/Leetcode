class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) pos.offer(nums[i]);
            else    neg.offer(nums[i]);
        }
        int[] res = new int[nums.length];
        int k = 0;
        for(int i=0; i<res.length/2; i++){
            res[k++] = pos.remove();
            res[k++] = neg.remove();
        }
        return res;
    }
}