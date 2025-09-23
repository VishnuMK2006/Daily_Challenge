class Solution {
   public int uniquePathsWithObstacles(int[][] obstacleGrid,int r,int c,int memo[][]){
    if(memo[r][c]!=-1) return memo[r][c];
    if(obstacleGrid[r][c]==1) return memo[r][c] = 0;
    if(r==0 && c==0) return memo[r][c] = 1;
    if(r==0) return uniquePathsWithObstacles(obstacleGrid,r,c-1,memo);
    if(c==0) return uniquePathsWithObstacles(obstacleGrid,r-1,c,memo);
    return memo[r][c] = uniquePathsWithObstacles(obstacleGrid,r-1,c,memo)+ uniquePathsWithObstacles(obstacleGrid,r,c-1,memo);
   }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int memo[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return uniquePathsWithObstacles(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,memo);
    }
}