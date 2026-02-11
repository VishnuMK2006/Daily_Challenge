class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0,right=0;
        long sum=0,max=0;
        // int feq[]=new int[100000+1];
        HashMap<Integer,Integer> hs = new HashMap<>();
        // Arrays.fill(feq,0);
        while(right<nums.length){
            
            hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
            sum+=nums[right];

            if(right-left+1==k && hs.size()==k){
                max=Math.max(max,sum);
                sum-=nums[left];
                        if(hs.get(nums[left])<=1) hs.remove(nums[left]);
                        else hs.put(nums[left],hs.get(nums[left])-1);
                left++;
            }else if(right-left+1==k){
                sum-=nums[left];
                        if(hs.get(nums[left])<=1) hs.remove(nums[left]);
                        else hs.put(nums[left],hs.get(nums[left])-1);
                left++;

            }

            right++;
        }
        return max;
    }
}