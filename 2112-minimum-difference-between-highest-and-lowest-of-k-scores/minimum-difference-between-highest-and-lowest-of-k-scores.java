class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k==1)
            return 0;
        Arrays.sort(nums);
        int l=0,r=k-1;
        int minDiff=Integer.MAX_VALUE;
        while(r<nums.length){
            int diff=nums[r]-nums[l];
            if(minDiff>diff)
                minDiff=diff;
            System.out.println(l+" "+r+" "+diff+" "+minDiff);
            l++;r++;
            
        }
            return minDiff;
    }
}

// brute force
// sliding window
// 