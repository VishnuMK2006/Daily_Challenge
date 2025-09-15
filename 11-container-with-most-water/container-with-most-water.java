class Solution {
    public int maxArea(int[] nums) {
        int res=0, left=0,right=nums.length-1,max=0;
        while(left<right){
            // max=Math.max(max,Math.min(nums[left],nums[right])*(right-left));
            int min = Math.min(nums[left], nums[right]);
            max = Math.max(max, min * (right - left));
            if(nums[left]<nums[right])
                left++;
            else
                right--;
        }
        return max;
    }
}