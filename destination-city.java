class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> h  = new HashMap<>();
        for(int i= 0; i<paths.size(); i++){
            h.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String destination="", s = paths.get(0).get(0);;
        for(int i= 0; i<paths.size(); i++){
            if(!h.containsKey(s)) break;
            destination = h.get(s);
            s=destination;
        }
        return destination;
        
    }
}