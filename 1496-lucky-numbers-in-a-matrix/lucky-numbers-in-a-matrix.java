class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        ArrayList<Integer> minr=new ArrayList<>();
        ArrayList<Integer> maxc=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int r=0;r<m.length;r++){
            int min=100000;
            for(int c=0;c<m[0].length;c++){
                if(min>m[r][c])
                    min=m[r][c];
            }
            minr.add(min);
        }
        for(int r=0;r<m[0].length;r++){
            int max=0;
            for(int c=0;c<m.length;c++){
                if(max<m[c][r])
                    max=m[c][r];
            }
            maxc.add(max);
        }
        for(int r=0;r<m.length;r++){
            for(int c=0;c<m[0].length;c++){
                // System.out.println(minr.get(r)+" "+maxc.get(c));
                if(m[r][c]==minr.get(r) && m[r][c]==maxc.get(c))
                    res.add(m[r][c]);
            }
        }
        return res;
    }
}