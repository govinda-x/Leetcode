class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] != newColor)
            dfs(image, sr, sc, image[sr][sc], newColor);
       
        return image;
    }
    
    void dfs(int[][] image, int sr, int sc, int color, int newColor){
        
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length ||color != image[sr][sc]){
            return;
        }
        
        image[sr][sc] = newColor;
        dfs(image, sr+1, sc, color, newColor);
        dfs(image, sr-1, sc, color, newColor);
        dfs(image, sr, sc+1, color, newColor);
        dfs(image, sr, sc-1, color, newColor);
    }

}