class Solution {
    public void DFS(int i, int j, boolean[][] vis, int m, int n, char[][] grid) {
        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] || grid[i][j] != '1') {
            return;
        }

        vis[i][j] = true;

        DFS(i + 1, j, vis, m, n, grid);
        DFS(i - 1, j, vis, m, n, grid);
        DFS(i, j + 1, vis, m, n, grid);
        DFS(i, j - 1, vis, m, n, grid);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int island = 0;

        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    DFS(i, j, vis, m, n, grid);
                    island++;
                }
            }
        }

        return island;
    }
}