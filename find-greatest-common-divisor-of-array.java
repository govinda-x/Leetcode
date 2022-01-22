class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE, max =Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int val =0;
        for(int i=1; i<=min; i++){
            if(min%i==0 && max%i==0) val =i;
        }
        return val;
    }
}