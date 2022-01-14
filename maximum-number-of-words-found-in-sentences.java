class Solution {
    public int mostWordsFound(String[] sentences) {
        int val =0;
        for(int i=0; i<sentences.length; i++){
            String [] ans = sentences[i].split(" ");
            val = Math.max(val, ans.length);
        }
        return val;
    }
}