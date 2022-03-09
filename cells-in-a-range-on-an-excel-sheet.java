class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<String>();
        char st = s.charAt(0), c =st, end= s.charAt(3);
        int n1 = Character.getNumericValue(s.charAt(1)) , n2 = Character.getNumericValue(s.charAt(4));
        for(int i = (int) st; i<=(int) end; i++){
            for(int j = n1; j<=n2; j++){
                ans.add(Character.toString(c)+""+j);
            }
            c++;
        }
        return ans;
    }
}