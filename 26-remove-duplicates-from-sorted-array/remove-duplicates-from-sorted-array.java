class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int filter=1;
        for(int i=0;i<nums.length;i++){
            if(nums[filter-1]!=nums[i]){
                nums[filter]=nums[i];
                filter++;
        }}
        return filter;
    }
}