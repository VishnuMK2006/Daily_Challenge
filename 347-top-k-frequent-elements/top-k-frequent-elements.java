class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i:nums){
            hs.put(i,hs.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hs.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        int[] res = new int[k];
        int ind = 0;
        for (Map.Entry<Integer,Integer> e : list) {
            res[ind++] = e.getKey();   
            if (ind == k) break;
        }
        return res;
    }
}