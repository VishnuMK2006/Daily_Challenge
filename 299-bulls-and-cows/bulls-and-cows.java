class Solution {
    public String getHint(String s1, String g1) {
        int b=0,c=0;
        StringBuilder s=new StringBuilder(s1);
        StringBuilder g=new StringBuilder(g1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==g.charAt(i)){
                b++;
                s.setCharAt(i,' ');
                g.setCharAt(i,'#');
            }
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int res=g.indexOf(String.valueOf(ch));
            if(res>=0){
                c++;
                s.setCharAt(i,' ');
                g.setCharAt(res,'#');
            }
        }
        System.out.println(s+"$"+g);
            return b+"A"+c+"B";
    }
}