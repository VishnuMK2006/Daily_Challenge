class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            int diff = target- numbers[i];
            if(!hs.containsKey(diff))
                hs.put(numbers[i],i+1);
            else{
                res[1]=i+1;
                res[0]=hs.get(diff);
            }
                
                }
                return res;
        }
            
    }
