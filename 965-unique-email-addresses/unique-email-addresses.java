class Solution {
    public int numUniqueEmails(String[] emails) {
        int i=0;
        Set<String> hs=new HashSet<>();
        for(String s: emails){
            String str[]=s.split("@");
            str[0]=str[0].replace(".","");
            int ind=str[0].indexOf("+");
            if(ind!=-1)
               hs.add(str[0].substring(0,ind)+"@"+str[1]);
            else
                hs.add(str[0]+"@"+str[1]);
        }
        return hs.size();
    }
}