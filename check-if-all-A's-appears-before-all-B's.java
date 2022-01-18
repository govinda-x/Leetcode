class Solution {
    public boolean checkString(String s) {
        int b = -1;
        for(int i=0; i<s.length(); i++){
            if(b==-1 && s.charAt(i)=='b'){
                b = i;
            }
            if(s.charAt(i)=='a' && b<i && b!=-1){
                return false;
            }
        }
        return true;
    }
}