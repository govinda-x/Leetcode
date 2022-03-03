class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        if(s1.equals(s2)) return true;
        int count =0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                list.add(i);
            }               
        }
        if(count>2 || list.size()==1) return false;
        StringBuilder sb = new StringBuilder(s1);
        char c = s1.charAt(list.get(0));
        sb.setCharAt(list.get(0),s1.charAt(list.get(1)));
        sb.setCharAt(list.get(1),c);
        return s2.equals(sb.toString());
    }
}