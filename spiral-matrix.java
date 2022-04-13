class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> ans = new ArrayList<>(); 
        int fc=0, fr=0, lc=m[0].length-1, lr=m.length-1;
        while(fc<=lc && fr<=lr){
            for(int i= fc; i<=lc; i++) ans.add(m[fr][i]);
            for(int i = fr+1; i<=lr; i++) ans.add(m[i][lc]);
            if(fc<lc && fr<lr){
                for(int i = lc-1; i>fc; i--) ans.add(m[lr][i]);
                for(int i = lr; i>fr; i--) ans.add(m[i][fc]);
            }
            fr++; fc++; lc--; lr--;
        }
        return ans;
    }
}