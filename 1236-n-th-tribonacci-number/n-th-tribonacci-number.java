class Solution {
    public int tribonacci(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return calctri(n,arr);
    }
    public int calctri(int n,int memo[]){
        if(memo[n]!=-1) return memo[n];
        if(n==0) return memo[n]=0;
        if(n==1) return memo[n]=1;
        if(n==2) return memo[n]=1;
        return memo[n]=calctri(n-1,memo)+calctri(n-2,memo)+calctri(n-3,memo);
    }
}