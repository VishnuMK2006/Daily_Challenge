class Solution {
    public int maximumWealth(int[][] arr) {
        int r=arr.length,c=arr[0].length,max=-1;
        int sum=0;
        for(int i=0;i<r*c;i++){
            if(i%c==0){
                System.out.println(sum);
                sum=0;
                sum+=arr[i/c][i%c];
            }else
                sum+=arr[i/c][i%c];
            max=Math.max(max,sum);
        }
        return max;
    }
}