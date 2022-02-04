class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       for(int i=0; i<4; i++){
            if(check(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }
    
    public boolean check(int[][] mat, int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    
    public void rotate(int[][] matrix) {
        
        //Transposing
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        //Reversing
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = t;
            }
        }
    }
}