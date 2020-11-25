class Solution 
{
    public int numJewelsInStones(String J, String S) 
    {
        int ans =0;
        int len_J = J.length();
        int len_S = S.length();
        for(int i=0; i<len_J; i++)
        {
            char j = J.charAt(i);
            for(int k=0 ; k<len_S; k++)
            {
                if(j==S.charAt(k))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}
