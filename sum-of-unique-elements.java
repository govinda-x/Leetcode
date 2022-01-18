class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i)) h.put(i, h.get(i)+1);
            else h.put(i,1);
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue() == 1) sum+=e.getKey();
        }
        return sum;
    }
}