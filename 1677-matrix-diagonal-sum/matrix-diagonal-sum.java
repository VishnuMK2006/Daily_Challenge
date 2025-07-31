class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
           sum+=mat[i][i];
           if(i==(mat[0].length-i-1))
                continue;
            sum+=mat[i][mat[0].length-i-1];
        }
        return sum;
    }
}