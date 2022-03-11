class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String n1=value(firstWord), n2=value(secondWord), n3 =value(targetWord);
        
        return ((Integer.parseInt(n1) + Integer.parseInt(n2)) == (Integer.parseInt(n3)))?true:false;
    }
    public String value(String word){
        String res ="";
        for(int i=0; i<word.length(); i++) res = res + Integer.toString((int)(word.charAt(i)-97));
        return res;
    }
}