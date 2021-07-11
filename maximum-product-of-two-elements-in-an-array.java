class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length<2) return -1;
        if(nums.length==2) return (nums[0]-1)*(nums[1]-1);
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        for(int i: nums) p.offer(i);
        while(p.size()!=2){
            p.poll();
        }
        int a = p.poll()-1;
        a = a*(p.poll()-1);
        return a;
    }
}