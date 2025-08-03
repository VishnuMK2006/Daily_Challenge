class Solution {
    public int sumOfUnique(int[] nums) {
        int res=0;
        int fre[]=new int[101];
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(fre[nums[i]]==1)
                res+=nums[i];
        }
        return res;
    }
}