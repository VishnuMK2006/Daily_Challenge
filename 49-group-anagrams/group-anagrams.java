class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs=new HashMap<>();

        for(String str:strs){
            int[] count = new int[26]; 
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append('#').append(num);
            }
            String key = sb.toString();

            hs.computeIfAbsent(key , k -> new ArrayList<>()).add(str);
        }
        return  new ArrayList<List<String>>(hs.values());
    }
}


//two ways we can slove it.