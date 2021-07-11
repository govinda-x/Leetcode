class Solution {
    public int lastStoneWeight(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i= 0; i<nums.length; i++) p.offer(nums[i]);
        while(p.size()!=1){
            int val = p.poll();
            val = val - p.poll();
            p.offer(val);
        }
        return p.peek();
    }
}