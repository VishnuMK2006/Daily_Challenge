//dynamic programming.---> top down approch
/*class Solution {
    public int calfib(int n,int memo[]){
        if(memo[n]!=-1) return memo[n]; //check the values in the table , if return the valus
        if(n==0) return memo[n] = 0; //before returning the value store it in the respective index 
        if(n==1) return memo[n] = 1; //   ''              ''                 ''             ''
        return memo[n] = calfib(n-1,memo) + calfib(n-2,memo);

    }
    public int fib(int n) {
        int[] arr=new int[n+1]; //this is the momoization table
        Arrays.fill(arr,-1); //initlize with -1 , becz the -1 is not a valid fibo
        return calfib( n, arr); //calculate the fibo values.
    }
}
*/

//dynamic programming.---> Bottom up approch


class Solution {
    public int fib(int n) {
        int arr[] = new int[n+1];
        if(n<2) return n;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}