class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=2) return true;
        int diff = Math.abs(arr[1]-arr[0]);
        for(int i=1; i<arr.length-1; i++){
            if(Math.abs(arr[i+1] - arr[i]) != diff) return false;
        }
        return true;
    }
}