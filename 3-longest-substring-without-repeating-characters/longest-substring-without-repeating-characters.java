class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,max=0;
        ArrayList<Character> al=new ArrayList<>();
        
        for(right=0;right<s.length();right++){
            while(al.contains(s.charAt(right))){
                al.remove(0);
                left++;
            }
            al.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}