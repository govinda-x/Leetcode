class Solution {
    
    public void generate(int i, List<Integer> arr, List<Integer> temp, List<List<Integer>> res, HashSet<List<Integer>> s ){
        if(i==arr.size()){
            if(!s.contains(temp)){
                s.add(temp);
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        
        generate(i+1, arr, temp, res, s);
        temp.add(arr.get(i));
        generate(i+1, arr, temp, res, s);
        temp.remove(temp.size()-1);
        
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> arr= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            arr.add(nums[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        if(arr== null){
            return res;
        }
        HashSet<List<Integer>> s= new HashSet<>();
        Collections.sort(arr);
        List<Integer> temp = new ArrayList<>();
        
        generate(0,arr, temp, res, s);
        return res;
    }
}