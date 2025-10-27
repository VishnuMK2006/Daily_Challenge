class NumArray {
        int arr[];
    public NumArray(int[] nums) {
       for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
            // System.out.print(nums[i]);
       }
       arr=nums;
    }
    
    public int sumRange(int left, int right) {
        return left==0? arr[right]:arr[right]-arr[left-1];
    }
}

// 0  1 2  3  4  5
//-2,-2,1,-4,-2,-3