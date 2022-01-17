class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int col=-1;
        if(ruleKey.equals("type")) col=0;
        else if(ruleKey.equals("color")) col=1;
        else col=2;
        int count =0;
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(col).equals(ruleValue)) count++;
        }
        return count;
    }
}