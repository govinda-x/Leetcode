class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max=-1;
        for(int i : candies) max = Math.max(max, i);
        for(int i:candies){
            int val = i + extraCandies;
            if(val>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}