class Solution {
    public int uniquePaths(int r,int c, int memo[][]){
        if(memo[r][c]!=-1) return memo[r][c];
        if(r==0 || c==0) return memo[r][c] = 1;
        return memo[r][c] = uniquePaths(r-1,c,memo)+uniquePaths(r,c-1,memo);
    }
    public int uniquePaths(int m, int n) {
        int memo[][]=new int[m][n];
         for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return uniquePaths(m-1,n-1,memo);
    }
}