class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        int max=arr[n],premax=-1;
        for(int i=n;i>=0;i--){
            if(arr[i]>max)
                max=arr[i];
            arr[i]=premax;
            premax=max;
        }
        return arr;
    }
}