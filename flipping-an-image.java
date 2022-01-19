class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            int start = 0;
            int end = c - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }   
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j]==1) arr[i][j] = 0;
                else arr[i][j] =1;
            }
        }
        return arr;
    }
}