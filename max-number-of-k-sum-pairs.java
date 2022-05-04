class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> h =new HashMap<>();
        int count=0;
        for(int i : nums){
            if(h.containsKey(k-i) && h.get(k-i)>0){
                count++;
                h.put(k-i,h.get(k-i)-1);
            }
            else h.put(i,h.getOrDefault(i,0)+1);
            
        }
        return count;
    }
}