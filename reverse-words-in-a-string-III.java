class Solution {
    public String reverseWords(String s) {
        String [] a = s.split(" ");
        String ans = "";
        for(String z : a){
            StringBuilder sb = new StringBuilder();
            sb.append(z);
            sb.reverse();
            ans+=sb.toString()+" ";
        }
        ans = ans.substring(0,ans.length()-1);
        return ans;
    }
}