class Solution {
    public int rob(int nums[],int n,int memo[]){
        if(memo[n]!=-1) return memo[n];
        if(n==0) return memo[n]=nums[0];
        if(n==1) return memo[n] = Math.max(nums[0],nums[1]);
        return memo[n] = Math.max(nums[n]+ rob(nums,n-2,memo), rob(nums,n-1,memo));
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int memo[]=new int[n];
        Arrays.fill(memo,-1);
        return rob(nums, n-1, memo);
    }
}