class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int e=0,o=nums.length-1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                res[e++]=nums[i];
            else
                res[o--]=nums[i];
        }
        return res;
    }
}