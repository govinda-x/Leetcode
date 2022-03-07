class Solution {
    public String interpret(String c) {
        String ans="";
        for(int i=0; i<c.length(); i++){
            if(c.charAt(i)=='G'){
                ans+="G";
            }
            if(c.charAt(i) == '('){
                if(c.charAt(i+1)=='a'){
                    ans+="al";
                    i+=3;
                }
                else{
                    ans+="o";
                    i+=1;
                }
            }
        }
        return ans;
    }
}