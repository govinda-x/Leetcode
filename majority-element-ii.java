class Solution {
    public List<Integer> majorityElement(int[] nums) {
        TreeMap<Integer, Integer> h = new TreeMap<>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i:nums){
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i, h.get(i)+1);
        }
        int n = nums.length/3;
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            if(e.getValue()>n) ans.add(e.getKey());
        }
        return ans;
    }
}