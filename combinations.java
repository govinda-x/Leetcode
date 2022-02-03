class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(k == 0) return result;
        
        helper(result, n, k, 1, new ArrayList<>());
        
        return result;
    }
    
    private void helper(List<List<Integer>> result, int n, int k, int start, List<Integer> temp){
        // base case
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        // logic
        for(int i = start; i <= n; i++){
            // action
            temp.add(i);
            // recurse
            helper(result, n, k, i+1, temp);
            // backtrack
            temp.remove(temp.size()-1);
        }
    }
}