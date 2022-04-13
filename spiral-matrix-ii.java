class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        int val =1, fc=0, fr=0, lc=n-1, lr=n-1;
        while(val<=n*n){
            for(int i= fc; i<=lc; i++){
                ans[fr][i] = val;
                val++;
            }
            fr++;
            for(int i = fr; i<=lr; i++){
                ans[i][lc] = val;
                val++;
            }
            lc--;
            for(int i = lc; i>=fc; i--){
                ans[lr][i] = val;
                val++;
            }
            lr--;
            for(int i = lr; i>=fr; i--){
                ans[i][fc] = val;
                val++;
            }
            fc++;
        }
        return ans;
    }
}