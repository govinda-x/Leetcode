class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap();
        for (int n: nums) {
          h.put(n, h.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> h.get(n1) - h.get(n2));
        
        for (int n: h.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }
        int[] ans = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}