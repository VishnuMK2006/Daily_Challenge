class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int l=i-1;
            int lsum=0,rsum=0;
            while(l>=0){
                lsum+=nums[l];
                l--;
            }
            int r=i+1;
            while(r<nums.length){
                rsum+=nums[r];
                r++;
                }
            if(rsum==lsum)
                return i;
        }
        return -1;
    }
}