class Solution {
    public int heightChecker(int[] heights) {
        int [] sort = heights.clone();
        Arrays.sort(sort);
        int c=0;
        for(int i=0; i<sort.length; i++){
            if(heights[i]!=sort[i]) c++;
        }
        return c++;
    }
}