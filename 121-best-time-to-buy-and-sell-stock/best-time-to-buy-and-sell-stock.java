class Solution {
    public int maxProfit(int[] nums) {
        int max=-1,min=100000;
        for(int i=0;i<nums.length;i++){
           min= Math.min(min,nums[i]);
           if(nums[i]-min>max)
            max=nums[i]-min;
        }
        return max;
    }
}