class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i =0, j = piles.length-1, sum=0;
        while(i<j-1){
            sum+=piles[j-1];
            i++;
            j-=2;
        }
        return sum;
    }
}
