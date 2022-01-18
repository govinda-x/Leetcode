class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> s = new HashSet<>();
        for(int i=0; i<allowed.length(); i++){
            s.add(allowed.charAt(i));
        }
        int cnt=0;
        for(int i=0; i<words.length; i++){
            int flag =0;
            for(int j=0; j<words[i].length(); j++){
                if(s.contains(words[i].charAt(j))) continue;
                else flag =1;
            }
            if(flag==0) cnt++;
        }
        return cnt;
    }
}