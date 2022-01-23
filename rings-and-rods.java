class Solution {
    public int countPoints(String rings) {
        int n = rings.length();
        if(n<6) return 0;
        HashMap<Character, HashSet<Character>> h = new HashMap<>();
        for(int i=0; i<n; i+=2){
            char c = rings.charAt(i);
            char v = rings.charAt(i+1);
            if(!h.containsKey(v)){
                HashSet<Character> s = new HashSet<>();
                s.add(c);
                h.put(v,s);
            }
            else{
                HashSet<Character> set = h.get(v);
                set.add(c);
                h.put(v,set);
            }
        }
        int count =0;
        for(Map.Entry<Character, HashSet<Character>> e : h.entrySet()){
            if(e.getValue().size() == 3) count++;
        }
    }
}