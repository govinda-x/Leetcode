class Solution {
    public int fib(int n) 
    {
        if(n ==0)
        {
            return 0;
        }
        if(n==1 || n==2)
        {
            return 1;
        }
        int s3 = 0, s1 =1, s2 =1;
        for(int i=3; i<=n; i++)
        {
            s3= s1+s2;
            s1= s2;
            s2=s3;
        }
        return s3;
    }
}
