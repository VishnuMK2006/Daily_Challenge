class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<(nums.length/2);i++){
            int count=0;
            while(count<nums[2*i]){
                al.add(nums[2*i+1]);
                count++;
            }
        }
        int[] arr = al.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}