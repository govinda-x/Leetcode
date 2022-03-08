class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> s= new HashSet<>();
        int i=0, j=0;
        s.add("0-0");
        for(int k =0; k<path.length(); k++){
            if(path.charAt(k) == 'N') j+=1;
            if(path.charAt(k) == 'S') j-=1;
            if(path.charAt(k) == 'E') i+=1;
            if(path.charAt(k) == 'W') i-=1;
            if(s.contains(i+"-"+j)) return true;
            else s.add(i+"-"+j);
            }
        return false;
    }
}