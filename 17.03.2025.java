class Solution {
    public boolean divideArray(int[] nums) {

        // using hashmap Runtime : 10ms
        HashMap<Integer, Integer> hs = new HashMap<>(501);
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                hs.put(nums[i], hs.get(nums[i]) - 1);
                if (hs.get(nums[i]) < 1)
                    hs.remove(nums[i]);
            } else
                hs.put(nums[i], 1);
        }
        return (hs.size() == 0) ? true : false;

        // using array and fixed size Runtime:1ms
        int fre[] = new int[501];
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (fre[nums[i]] % 2 != 0)
                return false;
        }
        return true;
    }
}