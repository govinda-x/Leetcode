class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> a  = new ArrayList<>();
        
        int j=0;
        for(int i=0; i<nums.length; i+=2){
            int f = nums[i];
            int v = nums[i+1];
            for(int z = 0; z<f; z++){
                a.add(v);
            }
        }
        int [] ans= new int[a.size()];
        for(int i:a){
            ans[j]=i;
            j++;
        }
        return ans;
    }
}