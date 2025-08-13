class Solution {
    public List<String> cellsInRange(String s) {
        List<String> al=new ArrayList<>();
        char st=s.charAt(0);
        char ed=s.charAt(3);
        int str=s.charAt(1)-'0';
        int etr=s.charAt(4)-'0';
        for(char i = st;i<=ed;i++){
            for(int j=str;j<=etr;j++){
                al.add(i+""+j);
            }
        }
        return al;
    }
}