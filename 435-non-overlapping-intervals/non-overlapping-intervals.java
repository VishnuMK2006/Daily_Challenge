class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        //step 1 sort the given array based on the second value
        Arrays.sort(nums,(a,b)->Integer.compare(a[1],b[1]));
        int curEnd=Integer.MIN_VALUE,res=0;
        for(int i[]:nums ){
            if(i[0]>=curEnd)
                curEnd=i[1];
            else if(curEnd>i[0])
                res++;
        }
        return res;
    }
}