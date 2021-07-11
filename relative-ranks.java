class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> h = new HashMap<>();
        String [] ans = new String[score.length];
        int j =0;
        for(int i : score){
            p.add(i);
            h.put(i, j);
            j++;
        }
        int c =1;
        while(p.size()!=0){
            int val = p.poll();
            int ind =  h.get(val);
            if(c == 1) ans[ind] = "Gold Medal";
            else if(c == 2) ans[ind] = "Silver Medal";
            else if(c==3) ans[ind] = "Bronze Medal";
            else ans[ind] = Integer.toString(c);
            c++;
        }
        return ans;
        
    }
}