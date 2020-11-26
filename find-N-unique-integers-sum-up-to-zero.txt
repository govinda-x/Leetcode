class Solution {
    public int[] sumZero(int n) 
    {
        int [] ans= new int[n];
        ans[0]=-n;
        ans[n-1]=n;
        if(n%2==0)
        {
            int l=1, r= n-2;
            while(l<r)
            {
                ans[l]=ans[l-1]-1;
                ans[r]=ans[r+1]+1;
                l++;
                r--;
            }
        }
        else
        {
            int l=1, r=n-2;
            int mid = (l+r)/2;
            ans[mid]=0;
            while(l<mid)
            {
                ans[l]=ans[l-1]-1;
                l++;
            }
            while(mid<r)
            {
                ans[r]=ans[r+1]+1;
                r--;
            }
        }
        return ans;
    }
}