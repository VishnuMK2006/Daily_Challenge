class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=hs.getOrDefault(nums[i],0);
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        return res;
    }
}