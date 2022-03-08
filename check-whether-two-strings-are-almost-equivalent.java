class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int [] a1 =new int[26];
        int [] a2 =new int[26];
        for(int i=0; i<word1.length(); i++)  a1[(int) (word1.charAt(i)-97)]++; 
        for(int i=0; i<word2.length(); i++)  a2[(int) (word2.charAt(i)-97)]++; 
        for(int i=0; i<26; i++){
            a1[i] = Math.abs(a1[i]-a2[i]);
            if(a1[i]>3) return false;
        }
        return true; 
    }
}