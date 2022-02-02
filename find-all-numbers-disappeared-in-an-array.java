class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        TreeSet<Integer> s = new TreeSet<>();
        for(int i=1; i<=nums.length; i++) s.add(i);
        for(int i:nums){
            s.remove(i);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i : s){
            ans.add(i);
        }
        return ans;
    }
}