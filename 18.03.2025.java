class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0,r=0,max=-1;
        int sum=0;
        if(nums.length==1)
            return 1;
        while(r<nums.length-1){
            sum|=nums[r];
            int nx=nums[r+1];
            while((sum&nx)!=0){
                sum^=nums[l];
                l++;}
            r++;
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}