class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans=1;
        int check [] = new int[9999];
        for(int i:arr) check[i]=1;
        for(int i=1;i<10000; i++){
            if(k>0 && check[i]==0){
                k--;
                ans =i;
            }
            if(k==0) break;
            
        }
        return ans;
    }
}