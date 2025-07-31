class Solution {
    public String restoreString(String s, int[] in) {
        StringBuilder res=new StringBuilder(s);
        for(int i=0;i<in.length;i++){
            res.setCharAt(in[i],s.charAt(i));
        }
        return res.toString();
    }
}