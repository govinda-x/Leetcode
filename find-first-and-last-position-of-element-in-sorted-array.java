class Solution {

    public int[] searchRange(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int firstOcc = -1;
        int lastOcc = -1;
        int ans[] = new int[2];

        //first occurence
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                firstOcc = mid;
                hi = mid - 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        //last occurence
        lo = 0;
        hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                lastOcc = mid;
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return new int[]{firstOcc , lastOcc};
    }
}