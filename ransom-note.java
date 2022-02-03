class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for(int i=0; i<r.length(); i++){
            if(!h1.containsKey(r.charAt(i))) h1.put(r.charAt(i),1);
            else h1.put(r.charAt(i),1+h1.get(r.charAt(i)));
        }
        for(int i=0; i<m.length(); i++){
            if(!h2.containsKey(m.charAt(i))) h2.put(m.charAt(i),1);
            else h2.put(m.charAt(i),1+h2.get(m.charAt(i)));
        }
        
        for(int i=0; i<r.length(); i++){
            if(!h2.containsKey(r.charAt(i)) || h1.get(r.charAt(i)) > h2.get(r.charAt(i))) return false;
        }
        return true;
    }
}