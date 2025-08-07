class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int feq[]=new int[101];
        for(int i=0;i<nums.length;i++){
            feq[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            feq[i]+=feq[i-1];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=(nums[i]==0)? 0:feq[nums[i]-1];
        }
        return result;
    }
}