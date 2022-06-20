class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.equals(t)) return true;
        HashMap<Character,Character> h = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c2 = t.charAt(i), c1 = s.charAt(i);
            if(!h.containsKey(c1)){
                if(set.contains(c2)) return false;
                h.put(c1,c2);
                set.add(c2);
            }
            else{
                char check = h.get(c1);
                if(c2!=check) return false;
                else continue;
            }
        }
        return true;
        
    }
}