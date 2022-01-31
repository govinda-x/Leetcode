class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: nums1) h.add(i);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : nums2){
            if(h.contains(i)){
                a.add(i);
                h.remove(i);
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
