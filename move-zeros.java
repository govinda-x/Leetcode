class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i: nums) a.add(i);
        int j=0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)!=0){
                int temp = a.get(j);
                a.set(j, a.get(i));
                a.set(i, temp);
                j++;
            }
        }
        j=0;
        for(int i: a){
            nums[j] = i;
            j++;
        }
    }
}