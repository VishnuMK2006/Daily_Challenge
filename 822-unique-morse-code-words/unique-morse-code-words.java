class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String res="";
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

       Set<String> hs=new HashSet<>();
        for(String str: words){
            res="";
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                res+=arr[ch-'a'];
            }
           
            hs.add(res);
        }
        return hs.size();
    }
}