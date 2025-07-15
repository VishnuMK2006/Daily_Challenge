class Solution {
    public boolean isvowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            return true;
        return false;
    }
    public boolean isValid(String word) {
        int v=0,c=0,i;
        char arr[]=word.toCharArray();
        for(i=0;i<arr.length;i++){
            //char ch=word.charAt(i);
            char ch=arr[i];
            if(ch>='0' && ch<='9')
                continue;
            if(ch=='@'|| ch=='#'||ch=='$')
                return false;
            if(isvowel(ch))
                v++;
            else
                c++;
        }
        if(v>0 && c>0 && i>=3)
            return true;
        return false;
    }
}