class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n =A.length;
        int m = n/2;
        int[] ans = new int[n];
        int[] even = new int[m];
        int[] odd = new int[m];
        int pos_even =0, pos_odd=0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2==0)
            {
                even[pos_even] = A[i];
                pos_even++;
            }
            else
            {
                odd[pos_odd] = A[i];
                pos_odd++;
            }
        }
        pos_even =0;
        pos_odd=0;
        
        for(int i=0; i<A.length; i++)
        {
            if(i%2==0)
            {
                ans[i] = even[pos_even];
                pos_even++;
            }
            else
            {
                ans[i] = odd[pos_odd];
                pos_odd++;
            }
        }
        return ans;        
    }
}
