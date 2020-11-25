class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char tempArray[] = s.toCharArray(); 
        Arrays.sort(tempArray); 
        s= new String(tempArray);
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray1);
        t= new String(tempArray1);
        if(s.equals(t))
        {
            return true;
        }
        return false;   
    }
}
