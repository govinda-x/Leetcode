class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        if(a!=0) p.add(a);
        if(b!=0) p.add(b);
        if(c!=0) p.add(c);
        int cnt=0;
        while(p.size()>=2){
            a = p.poll();
            b = p.poll();
            a--; b--;
            if(a!=0) p.add(a);
            if(b!=0) p.add(b);
            cnt++;
        }
        return cnt;
    }
}