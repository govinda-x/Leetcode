class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String i : patterns) if(word.indexOf(i)!=-1) c++;
        return c;
    }
}