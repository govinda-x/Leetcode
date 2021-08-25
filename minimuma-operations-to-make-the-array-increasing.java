class Solution {
    public int minOperations(int[] a) {
        if(a.length <=1) return 0;
        int c=0;
        for(int i=1; i<a.length; i++){
            if(a[i-1]<a[i]) continue;
            else{
                if(a[i-1] == a[i]) {
                    a[i]+=1;
                    c++;
                }
                else{
                    int diff = Math.abs(a[i] - a[i-1])+1;
                    a[i]+=diff;
                    c+=diff;
                }
            }
        }
        return c;
    }
}