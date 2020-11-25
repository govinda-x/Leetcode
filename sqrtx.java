class Solution {
    public int mySqrt(int x) 
    {
        if(x==1)
        {
            return 1;
        }
        int ans = 0;
        int l=1, r=x;
        while(l<=r)
        {
            long mid = l + (r - l) / 2;
            if(mid*mid<=x)
            {
                ans= (int)mid;
                l=(int)(mid+1);
            }
            else if(mid*mid>x)
            {
                r =(int)(mid-1);
            }
        }
        return ans;
    }
}
