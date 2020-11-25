class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0, prod = 1, a=0;
        while(n>0)
        {
            a = n%10;
            prod*=a;
            sum+=a;
            n=n/10;
        }
        int res = prod - sum;
        return res;
    }
}
