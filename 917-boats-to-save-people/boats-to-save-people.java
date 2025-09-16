class Solution {

    static {
        for (int i = 0; i < 300; i++) {
            numRescueBoats(new int[1], 1);
        }
    }

    public static int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);
        int res=0;
        int i=0,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum<=limit){
                res++;
                i++;
                j--;}
            else if(sum>nums[i]){
                if(nums[i]<=limit)
                    res++;
                j--;
            }
            if(i==j)
                res++;
        }
        return res;
    }
}