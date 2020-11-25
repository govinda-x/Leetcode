class Solution{
    public int repeatedNTimes(int[] A) 
    {
        int ans = 0, max=0;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i =0; i<A.length; i++)
        {
            if(!h.containsKey(A[i]))
            {
                h.put(A[i],1);
            }
            h.put(A[i], h.get(A[i])+1);
        }
        max = Collections.max(h.values());
        for(int i =0; i<A.length; i++)
        {
            if(max == h.get(A[i]))
            {
                ans = A[i];
            }
        }
        return ans;
    }
}
