//dutch flag algorithm.

class Solution {
    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;
        for(int i=0;i<nums.length && i <=r;i++){
            if(nums[i]==0){
                int temp = nums[l];
                nums[l++]=nums[i];
                nums[i]=temp;
                }
            else if(nums[i]==1)
                continue;
            else{
                int temp = nums[r];
                nums[r--]=nums[i];
                nums[i]=temp;
                i--;
                }
        }
    }
}