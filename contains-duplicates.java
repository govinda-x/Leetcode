class Solution {
    public boolean containsDuplicate(int[] a) {
        HashSet<Integer> s = new HashSet<>();
        for(int i:a){
            if(!s.contains(i)) s.add(i);
            else return true;
        }
        return false;
    }
}