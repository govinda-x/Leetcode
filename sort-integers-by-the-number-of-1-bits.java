class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer, List<Integer>> h = new TreeMap<>();     
        for(int n: arr){
            int i=n;
            int c=0;
            while(i!=0){
                c+=i&1;
                i=i>>1;
            }
            if(!h.containsKey(c)){
                List<Integer> l = new ArrayList<>();
                l.add(n);
                h.put(c,l);
            }
            else{
                List<Integer> l = h.get(c);
                l.add(n);
                h.put(c,l);
            }
        }
        int i=0;
        for(Map.Entry<Integer, List<Integer>> e : h.entrySet()){
            List<Integer> l = e.getValue();
            Collections.sort(l);
            for(int z:l){
                arr[i++] = z;
            }
        }
        return arr;
    }
}