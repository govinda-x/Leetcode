class Solution {
    public int kthSmallest(int[][] m, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(Collections.reverseOrder());
        int n1 = m.length, n2 = m[0].length;
        for(int i=0; i<n2; i++){
            for(int j = 0;j<n1; j++){
                if(p.size()<k){
                    p.offer(m[j][i]);
                }
                else{
                    if(m[j][i]<p.peek()){
                        p.poll();
                        p.offer(m[j][i]);
                    }
                }
            }
        }
        return p.peek();
    }
}