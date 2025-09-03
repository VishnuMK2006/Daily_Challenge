class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        return s;
        StringBuilder arr[]=new StringBuilder[numRows+1];
            for(int i=0;i<=numRows;i++){
                arr[i]=new StringBuilder();
            }
        int i=-1,j=numRows;
        Boolean check=true;
        for(int ind=0;ind<s.length();ind++){
            if(check)
                arr[++i].append(s.charAt(ind));
            else
               arr[--i].append(s.charAt(ind)); 

            if(i==j-1)
                check=false;
            if(i==0)
                check=true;
        }
        for( i=0;i<numRows;i++){
                arr[arr.length-1].append(arr[i]);
            }
        return arr[arr.length-1].toString();
    }
}