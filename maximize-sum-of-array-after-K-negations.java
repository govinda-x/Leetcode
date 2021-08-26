class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i: nums) p.offer(i);
        while(k>0){
            int v = p.peek();
            p.poll();
            v*=-1;
            p.offer(v);
            k--;
        }
        int sum =0;
        while(!p.isEmpty()) sum+=p.poll();
        return sum;
        
    }
}