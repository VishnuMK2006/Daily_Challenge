class Solution {
    public int[] decode(int[] e, int f) {
        int res[]=new int[e.length+1];
        res[0]=f;
        for(int i=0;i<e.length;i++){
            res[i+1]=(f^e[i]);
            f=res[i+1];
        }
        return res;
    }
}