class Solution {
public:
    int hammingDistance(int x, int y) {
        int mod = 1000000007;
        int sum = 0;
        for (int bitPos = 0; bitPos <=31; bitPos++) 
        {
            int One = 0, Zero = 0;
            if (x & (1 << bitPos))
            {
                One++;
            }
            else 
            {
                Zero++;
            }
            if (y & (1 << bitPos))
            {
                One++;
            }
            else 
            {
                Zero++;
            }
            sum = (sum + ((2LL * One * Zero) % mod))%mod;
        }   
     
        return sum/2;
        
    }
};
