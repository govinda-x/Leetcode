class Solution {
    public int largestAltitude(int[] gain) {
        int max =0,sum=0;
        for(int i : gain){
            sum+=i;
            max = Math.max(max, sum);
        }
        return max>0?max:0;
    }
}