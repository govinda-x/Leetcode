class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char [] arr = new char[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            int pos = indices[i];
            arr[pos]= temp;
        }
        return new String(arr); 
    }
}
