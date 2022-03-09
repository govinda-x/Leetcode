class Solution {
    public int countTriples(int n) {
        int count = 0;
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int i = 5; i <= n; i++) hset.add(i*i);
        for(int a = 1; a < n; a++) {
            for(int b = 1; b < n; b++) {
                int x = (a*a + b*b);
                if(hset.contains(x)) count++;
            }
        }
        return count;
    }
}