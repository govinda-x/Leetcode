class Solution {
    public String freqAlphabets(String s) {
        if(s.length() == 0) return "";
        int n = s.length();
        String ans="";
        for(int i=0; i<n;){
            String num="";
            char c;
            int convert=0;
            if((i+2)<n && s.charAt(i+2)=='#'){
                num = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
                convert = Integer.parseInt(num);
                c =(char) (97+convert-1);
                i+=3;
            }
            else{
                num = Character.toString(s.charAt(i));
                convert = Integer.parseInt(num);
                c =(char) (97+convert-1);
                i++;
            }
            ans+=Character.toString(c);
        }
        return ans;
    }
}