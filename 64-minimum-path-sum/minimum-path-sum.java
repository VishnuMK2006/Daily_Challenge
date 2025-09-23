
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


 

// class Solution {
//     public int minPathSum(int[][] grid) {
//         int db[][] = new int[grid.length][grid[0].length];
//         db[0][0]=grid[0][0];

//         //only row
//         for(int i=1;i<grid[0].length;i++){
//             db[0][i] = grid[0][i]+ db[0][i-1];
//         }

//         //only col
//         for(int i=1;i<grid.length;i++){
//             db[i][0] = grid[i][0]+ db[i-1][0];
//         }

//         //full matrix
//         for(int r=1;r<grid.length;r++){
//             for(int c=1;c<grid[0].length;c++){
//                 db[r][c]= grid[r][c]+ Math.min(db[r-1][c], db[r][c-1]);
//             }
//         }
//         return db[grid.length-1][grid[0].length-1];
//     }
// }