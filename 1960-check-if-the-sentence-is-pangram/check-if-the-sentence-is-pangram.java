class Solution {
    public boolean checkIfPangram(String s) {
        char fre[]=new char[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'a']++;
            if(fre[s.charAt(i)-'a']==1)
                count++;
        }
        return count==26? true:false;
    }
}