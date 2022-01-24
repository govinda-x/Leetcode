class Solution {
    public int numberOfMatches(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        return n%2==0?(n/2+numberOfMatches(n/2)):((n-1)/2+numberOfMatches((n-1)/2 + 1)); 
    }
}