class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int val: nums){
            if(i==0||i==1||nums[i-2]!=val){
                nums[i++]=val;
            }
        }
        return i;
    }
}