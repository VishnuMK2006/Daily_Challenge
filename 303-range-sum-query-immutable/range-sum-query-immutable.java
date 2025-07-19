class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        for(int i=1; i< nums.length; i++){
            nums[i] += nums[i-1];
        }
        arr=nums;
        // for(int i=1;i<nums.length;i++){
        //     arr[i]=arr[i-1]+arr[i];
        // }
        
    }
    
    public int sumRange(int left, int right) {
        return (left>0)? (arr[right]-arr[left-1]): arr[right];
}
}