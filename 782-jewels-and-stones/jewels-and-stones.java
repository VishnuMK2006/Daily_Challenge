class Solution {
    public int numJewelsInStones(String j, String s) {
        int count=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++)
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        for(int i=0;i<j.length();i++)
            count+=hs.getOrDefault(j.charAt(i),0);
        return count;
    }
}

/*
approch 1
    Hashmap
 */