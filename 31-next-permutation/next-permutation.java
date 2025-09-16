class Solution {
    public void swap(int arr[],int s,int e){
            while(s<e){
                int t=arr[s];
                arr[s]=arr[e];
                arr[e]=t;
                s++;
                e--;
            }
    }
    public void nextPermutation(int[] nums) {
        int fmax=nums.length-2,fmin=nums.length-1;
        while(fmax>=0 && nums[fmax]>=nums[fmax+1]) fmax--;
        if(fmax>=0){
        while(fmin>=0 && nums[fmax]>=nums[fmin]) fmin--;
        int t=nums[fmax];
        nums[fmax]=nums[fmin];
        nums[fmin]=t;
        }
        swap(nums,fmax+1,nums.length-1);
        

    }
}