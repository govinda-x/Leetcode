class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = arr1.length;
        for( int i = 0 ; i < arr1.length ;i++ ){
            int left = 0;
            int right = arr2.length-1;
            while ( left <= right ){
                int mid = ( left + right ) >>> 1;
                if ( Math.abs(arr1[i] - arr2[mid]) <= d ){
                    ans--;
                    break;
                }
                else if ( arr2[mid] < arr1[i] )
                    left = mid+1;
                else
                    right = mid-1;
            }
        }
        return ans;
    }
}