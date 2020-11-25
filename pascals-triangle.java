class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(numRows==0)
        {
            return ans;
        }
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        ans.add(prev);
        for(int i=2; i<=numRows; i++)
        {
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j=0 ; j<prev.size()-1; j++)
            {
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;           
        }
        return ans;

    }
}
