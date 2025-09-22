/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i=cost.length;
        int sum=0;
        while(i>1){
            sum+=Math.min(cost[i-1],cost[i-2]);
            if(cost[i-1]<cost[i-2])
                i--;
            else
                i-=2;
        }
        return sum;
    }
}
 */

class Solution {
    public int minCostClimbingStairs(int cost[],int n,int memo[]){
        if(n<0) return 0;
        if(memo[n]!=-1) return memo[n];
        return memo[n] = cost[n]+Math.min(minCostClimbingStairs(cost,n-1,memo) ,minCostClimbingStairs(cost,n-2,memo));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int memo[]=new int[n];
        Arrays.fill(memo,-1);
        return Math.min(minCostClimbingStairs(cost,n-1,memo) ,minCostClimbingStairs(cost,n-2,memo));
    }
}