class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:arr) h.put(i, h.getOrDefault(i,0)+1);
        for(int i:arr){
            if(h.containsKey(i*2) && i!=0) return true;
            if(h.containsKey(i*2) && i==0 && h.get(i)>1) return true;
        }
        return false;  
    }
}
    