class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        int fre[]=new int[101];
        //take the feq of the array
        for(int i=0;i<nums.length;i++){
            fre[nums[i]]++;
        }
        //make the prefix sum
        for(int i=1;i<101;i++){
            fre[i]+=fre[i-1];
        }
        //res construct
        for(int i=0;i<nums.length;i++){
            res[i]= nums[i]==0? 0:fre[nums[i]-1];
        }
        return res;
    }
}