class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if (poured == 0) {
            return 0;
        }
        double[] m = new double[101];
        m[0] = poured;
        for (int row = 0; row < query_row; row++) {
            for (int col = row; col >= 0; col--) {
                if (m[col] > 1) {
                    double q = (m[col] - 1) / 2;
                    m[col+1] += q;
                    m[col] = q;
                } 
                else {
                    m[col] = 0;
                }
            }
        }

        return Math.min(1, m[query_glass]);
    }
}