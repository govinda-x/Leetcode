class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums1){
            if(!h.containsKey(i)) h.put(i,1);
            else h.put(i, h.get(i)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : nums2){
            if(h.containsKey(i) && h.get(i)>0){
                a.add(i);
                h.put(i, h.get(i)-1);
            }
        }
        int[] ans =new int[a.size()];
        int j=0;
        for(int i: a){
            ans[j] = i;
            j++;
        }
        return ans;
    }
}