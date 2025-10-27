class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hs=new HashMap<>();
        hs.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int diff=target-nums[i];
            if(hs.containsKey(diff))
                return new int[]{hs.get(diff),i};
            else
                hs.put(nums[i],i);
        }
        return new int[]{0,0};  
    }
}