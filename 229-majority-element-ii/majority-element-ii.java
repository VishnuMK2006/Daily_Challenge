class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1=0,c1=0,can2=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && can2!=nums[i]) can1=nums[i];
            else if(c2==0 && can1!=nums[i]) can2=nums[i];
            if(can1==nums[i]){ 
                c1++;
            }
            else if(can2==nums[i]){ 
                c2++;
            }else{
                c1--;c2--;
            }
            
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==can1) c1++;
            if(nums[i]==can2) c2++;
        }
        List<Integer> res=new ArrayList<>();
        if(c1>nums.length/3 && can1!=can2)  res.add(can1);
        if(c2>nums.length/3) res.add(can2);
        return res;
    }
}