class Solution {
    public void swap(int s,int e, int arr[]){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        swap(0,nums.length-1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length-1,nums);
    }
}