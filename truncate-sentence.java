class Solution {
    public String truncateSentence(String s, int k) {
        String [] ar = s.split(" ");
        String ans="";
        for(int i=0; i<k; i++){
            if(i==k-1){
                ans+=ar[i];
            }
            else ans+=ar[i]+" ";
        }
        return ans;
    }
}