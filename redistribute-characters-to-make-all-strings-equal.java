class Solution {
    public boolean makeEqual(String[] words) {
        int count[] = new int[26];
        int n= words.length;
        for(String str : words){
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(count[i]%n != 0){
                return false;
            }
        }
        return true;
    }
}