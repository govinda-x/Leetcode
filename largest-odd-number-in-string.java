class Solution {
    public String largestOddNumber(String num) {
        int i;
        for(i= num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            if(c=='1' || c=='5' || c=='7' || c=='3' || c=='9'){
                break;
            }
        }
        return num.substring(0,i+1);
    }
}