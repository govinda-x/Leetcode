class Solution {
    public boolean isHappy(int n) {
        if (n == 4) return false;
        else if (n == 1) return true;
        int sum=0;
        while(n!=0){
            int a = n%10;
            sum+=a*a;
            n/=10;
        }
        return isHappy(sum);
    }
}