class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

       Set<String> hs=new HashSet<>();
        for(String str: words){
            StringBuilder res=new StringBuilder();
            for(char ch:str.toCharArray()){
                res.append(arr[ch-'a']);
            }
            hs.add(res.toString());
        }
        return hs.size();
    }
}