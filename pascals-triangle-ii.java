class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        if(rowIndex == 0 )
        {
            return ans;
        }
        List<Integer> prev = getRow(rowIndex-1);
        for(int i=1; i<prev.size(); i++)
        {
            ans.add(prev.get(i-1)+prev.get(i));
        }
        ans.add(1);
        return ans;
    }
}
