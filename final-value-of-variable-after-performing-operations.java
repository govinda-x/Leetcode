class Solution {
    public int finalValueAfterOperations(String[] o) {
        int val =0;
        for(int i=0; i<o.length; i++){
            if(o[i].equals("++X") || o[i].equals("X++")) val++;
            else val--;
        }
        return val;
    }
}