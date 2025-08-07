class Solution {
    public int reverse(int x) {
        long rem=0,sum=0;
        while(x!=0){
            rem=x%10;
            sum=(sum*10) + rem;
            x/=10;
        }
        if(sum>=-Math.pow(2,31) && sum<Math.pow(2,31))
            return (int)sum;
        return 0;
    }
}