class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int timer = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    // encountered rotten orange
                    q.add(new int[]{i, j});
                    // we don't have to visit this now
                    grid[i][j] = 0;
                }
            }
        }
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int[] tmp = q.remove();
                int x = tmp[0], y = tmp[1];
                for (int[] dir: dirs) {
                    int newX = dir[0] + x;
                    int newY = dir[1] + y;
                    if (newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && grid[newX][newY] == 1) {
                        q.add(new int[]{newX, newY});
                        grid[newX][newY] = 0;
                    }
                }
            }
            timer++;
        }
        for (int[] g: grid) {
            for (int o: g) {
                if (o == 1) {
                    return -1;
                }
            }
        }
        return timer == -1 ? 0 : timer;
    }
}