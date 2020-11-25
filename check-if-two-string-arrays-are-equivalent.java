class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String w1="", w2="";
        for(int i=0; i<word1.length; i++)
        {
            w1 = w1+word1[i];
        }
        for(int i=0; i<word2.length; i++)
        {
            w2 = w2+word2[i];
        }
        if(w1.equals(w2))
        {
            return true;
        }

        return false;
    }
}
