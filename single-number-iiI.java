class Solution {
    public int[] singleNumber(int[] arr) {
        int n=arr.length;
        int xor=0;
        for(int x:arr) xor^=x;
        int zero=0, one=0, rmsb=xor&-xor;
        for(int x:arr){
            if((x&rmsb)>0){
                one^=x;
            }
            else zero^=x;
        }
        return new int[] {zero,one};
        
    }
} 