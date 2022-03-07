class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length(), i=0, j=0, f=0;
        if(n==0) return word2;
        if(m==0) return word1;
        String ans="";
        while(i<n && j<m){
            if(f==0){
                f=1;
                ans+=Character.toString(word1.charAt(i));
                i++;
            }
            else{
                f=0;
                ans+=Character.toString(word2.charAt(j));
                j++;
            }
        }
        if(i<n) ans+=word1.substring(i);
        if(j<m) ans+=word2.substring(j);
        return ans;
    }
}