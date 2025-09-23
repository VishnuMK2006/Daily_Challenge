class Solution {
    public int longestCommonSubsequence(char[] t1, char[] t2,int i,int j,int memo[][]) {
        if(i<0 || j<0) return 0;
        if(memo[i][j]!=-1) return memo[i][j];
        // if(i<0 || j<0) return memo[i][j]=0;
        if(t1[i]==t2[j]) return memo[i][j] = 1+longestCommonSubsequence(t1,t2,i-1,j-1,memo);
        return memo[i][j] = Math.max(longestCommonSubsequence(t1,t2,i-1,j,memo),longestCommonSubsequence(t1,t2,i,j-1,memo));
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int memo[][]=new int[t1.length()][t2.length()];
        
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return longestCommonSubsequence(t1.toCharArray(), t2.toCharArray(), t1.length()-1,t2.length()-1,memo);
    }
}