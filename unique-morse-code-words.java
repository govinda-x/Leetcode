class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> s = new HashSet<>();
        String [] arr= {".-","-...","-.-.","-..",".",
                        "..-.","--.","....","..",".---","-.-",
                        ".-..","--","-.","---",".--.","--.-",
                        ".-.", "...","-","..-","...-",".--",
                        "-..-","-.--","--.."};
        for(int i=0; i<words.length; i++){
            String aa = "";
            for(int j=0; j<words[i].length(); j++){
                int ind = words[i].charAt(j) - 97;
                aa+=arr[ind];
            }
            s.add(aa);
        }
        return s.size();
    }
        
}