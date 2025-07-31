class Solution {
    public int busyStudent(int[] s, int[] e, int q) {
        int res=0;
        for(int i=0;i<s.length;i++)
           if(q>=s[i] && q<=e[i]) res++;
        return res;
    }
}