class Solution {
    public String getSmallestString(int n, int k) {
        char c[]= new char[n];
        Arrays.fill(c,'a');
        k-=n; 
        for(int i=n-1;i>=0 && k>0 ;i--){
            c[i]+=Math.min(25,k);
            k-=Math.min(25,k);
        }
        return String.valueOf(c);
    }
}