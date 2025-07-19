class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        while(left<=right){
            sum+=arr[left++];
        }

        return sum;
}
}