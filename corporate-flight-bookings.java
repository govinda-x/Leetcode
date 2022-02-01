class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for(int[] curr : bookings){
            int start = curr[0]-1;
            int end = curr[1];
            int val = curr[2];
            res[start] += val;
            if(end < n){
                res[end] -= val;
            }
        }
        for(int i = 1 ; i < n ; i++){
            res[i] += res[i-1];
        }
        return res;
    }
}