class Solution {
    public String interpret(String cmd) {
       String s=cmd.replace("()","o");
        cmd=s.replace("(al)","al");
        return cmd;
}}