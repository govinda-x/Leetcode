class Solution {
    public boolean judgeCircle(String moves) {
        int i=0,j=0;
        for(int k=0;k<moves.length(); k++){
            if(moves.charAt(k) == 'U') j++;
            if(moves.charAt(k) == 'D') j--;
            if(moves.charAt(k) == 'R') i++;
            if(moves.charAt(k) == 'L') i--;
        }
        if(i==0 && j==0) return true;
        return false;
    }
}