class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
    public void reverse(int [][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
        }
    }
}