class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int maxsum = 0;
        for(int i = 0; i < arr.length; i++){
            int len = 0, sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                len++;
                if(len % 2 != 0){
                    maxsum += sum;
                }
            }
        }
        return maxsum;
    }
}