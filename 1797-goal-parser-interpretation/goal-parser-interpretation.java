class Solution {
    public String interpret(String cmd) {
        // String arr[]={"o","al","G"};
        // int temp=0;
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<cmd.length();i++){
        //     temp+=cmd.charAt(i);
        //     if(temp%3<3){
        //        res.append(arr[temp%3]);
        //        temp=0;
        //        }
        // }
        cmd=cmd.replace("()","o");
        cmd=cmd.replace("(al)","al");
        return cmd;
}}