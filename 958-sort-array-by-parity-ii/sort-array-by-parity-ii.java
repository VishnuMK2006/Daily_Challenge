class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[]=new int[nums.length];
        int oind=1,eind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && eind<nums.length){
                res[eind]=nums[i];
                eind+=2;
                }
            else if(nums[i]!=0 && oind<nums.length){
                res[oind]=nums[i];
                oind+=2;
                }
        }
        return res;
    }
}