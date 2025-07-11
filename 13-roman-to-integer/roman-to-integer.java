class Solution {
    public int romanToInt(String s) {
        /*itrate 0-lenth
        i>i+1-->+
        else - */
        int total=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()){
                if(val(s.charAt(i))>=val(s.charAt(i+1))){
                    total+=val(s.charAt(i));
                }else{
                    total=total+(val(s.charAt(i+1))-val(s.charAt(i)));
                    i++;
                }
            }else{
                total+=val(s.charAt(i));
            }
           }
           return total;
        }
    
   public int val(char c){
        switch(c){
            case 'M':
            return 1000;
            case 'D':
            return 500;
            case 'C':
            return 100;
            case 'L':
            return 50;
            case 'X':
            return 10;
            case 'V':
            return 5;
            case 'I':
            return 1;
           }
           return 0;
            }
}