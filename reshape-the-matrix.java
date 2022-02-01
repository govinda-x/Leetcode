class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length) return mat;
        ArrayList<Integer> a = new ArrayList<>();
        int[][] ans = new int[r][c];
        for(int[] i:mat){
            for(int j : i){
                a.add(j);
            }
        }  
        int z=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j] = a.get(z);
                z++;
            }
        }
        return ans;
    } 
}