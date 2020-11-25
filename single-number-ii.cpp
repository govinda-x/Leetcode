class Solution {
public:
    int singleNumber(vector<int>& A) {
        int result = 0, count;
        for(int  i=0; i<32; i++)
        {
            count =0;
            for(int j =0 ; j< A.size(); j++)
            {
                if((A[j] >> i) & 1 == 1)
                {
                    count++;
                }
            }
            result+=(count%3)<<i;
        }
        return result;
    }
};
