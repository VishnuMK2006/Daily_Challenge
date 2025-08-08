class Solution {
    public int numUniqueEmails(String[] emails) {
        int i=0;
        Set<String> hs=new HashSet<>();
        for(String s: emails){
            String str[]=s.split("@");
            str[0]=str[0].replace(".","");
            int ind=str[0].length();
            if(str[0].contains("+"))
                ind=str[0].indexOf("+");
           hs.add(str[0].substring(0,ind)+"@"+str[1]);
        }
        return hs.size();
    }
}