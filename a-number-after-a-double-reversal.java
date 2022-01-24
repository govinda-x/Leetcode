class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num<10) return true;
        if(num%10==0) return false;
        int n = 0;
        while(num!=0){
            n=n*10+num%10;
            num/=10;
        }
        if(n%10==0) return false;
        return true;
    }
}