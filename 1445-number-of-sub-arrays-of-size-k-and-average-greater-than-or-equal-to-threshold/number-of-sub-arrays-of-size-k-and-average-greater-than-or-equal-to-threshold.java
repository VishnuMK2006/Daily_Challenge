class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right=0,max=Integer.MIN_VALUE,count =0,sum=0;

        while(right<arr.length){ //travel until the end
            sum+=arr[right]; //put into window
            if(right-left+1==k){ //condition to reduce the window
                count+=((sum/k)>=threshold)?1:0;
                sum-=arr[left++];
            }    
            right++; //move the window always
        }
        return count;    
    }
}