class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            int min=arr[i][0];
            int max=0;
            int colindex=0;
            for(int col=0;col<n;col++){
                if(arr[i][col]<min){
                    min=arr[i][col];
                    colindex=col;
                }
            }
            boolean istrue=true;
            for(int col=0;col<m;col++){
                if(arr[col][colindex]>min)
                    istrue=false;
            }
            if(istrue) res.add(min);

        }
        return res;
    }
}