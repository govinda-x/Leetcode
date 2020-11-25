class Solution 
{
    public String defangIPaddr(String address) 
    {
        int l = address.length();
        String n = "";
        for(int i=0; i<l; i++)
        {
            if(address.charAt(i)=='.')
            {
                n=n+"[.]";
            }
            else
            {
                n=n+address.charAt(i);
            }
        }

        return n;
    }
}
