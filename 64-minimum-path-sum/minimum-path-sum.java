class Solution {
    public int minPathSum(int[][] grid,int r,int c,int memo[][]) {
        if(memo[r][c]!=-1) return memo[r][c];
        if(r==0 && c==0 )return memo[r][c] = grid[r][c];
        if(r==0) return  memo[r][c] = grid[r][c] + minPathSum(grid, r, c-1,memo);
        if(c==0) return  memo[r][c] = grid[r][c] + minPathSum(grid, r-1, c,memo);
        return memo[r][c] = grid[r][c]+ Math.min(minPathSum(grid,r-1,c,memo), minPathSum(grid,r,c-1,memo));
    }
    public int minPathSum(int[][] grid) {
        int memo[][]=new int[grid.length][grid[0].length];
         for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return minPathSum(grid,grid.length-1,grid[0].length-1,memo);
    }
}