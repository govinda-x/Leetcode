class Solution {
    public int reverse(int x) 
    {
        if(x<10 && x>=0)
        {
            return x;
        }
        
        int sign =1;
        if(x<0)
        {
            sign =-1;
            x = Math.abs(x);
        }
        
        long num = 0;
        while(x!=0)
        {
            int a = x%10;
            num = num*10+a;
            x=x/10;
        }
        num = num*sign;
        if(num > Math.pow(2,31)-1)
        {
            return 0;
        }
        int neg = -1;
        if(num < neg*(Math.pow(2,31)))
        {
            return 0;
        }
        return (int)(num);
    }
}
