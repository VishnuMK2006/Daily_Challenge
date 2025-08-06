class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        char arr[]=s.toCharArray();
        
        if(s.length()==0)
            return 0;
        else 
        
        if(arr[0]=='-'|| arr[0]=='+'){
            int i=1;
            long res=0;
            while((i<arr.length)&&(arr[i]>='0' && arr[i]<='9')){     
                res= res*10+(arr[i]-'0');
                i++;
            }
            if(res>=Integer.MIN_VALUE && res<=Integer.MAX_VALUE)
                return (arr[0]=='-')? (int)-res:(int)res;
            return (arr[0]=='-')? Integer.MIN_VALUE: Integer.MAX_VALUE;
        }
        else{
            int i=0;
            long res=0;
            while((i<arr.length)&&(arr[i]>='0' && arr[i]<='9')){
                res= res*10+(arr[i]-'0');
                if(i>=14 && res>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                i++;
            }
            if(res>=Integer.MIN_VALUE && res<=Integer.MAX_VALUE)
                return (int)res;
            return Integer.MAX_VALUE;
        }
             
        
    }
}