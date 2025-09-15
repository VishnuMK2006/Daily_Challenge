class Solution {
    public double[] modify(int[][] nums){
        double res[]=new double[nums.length];
        for(int i=0;i<nums.length;i++){
                res[i]=(double)nums[i][0]/nums[i][1];   
        }
        return res;
    }
    public long interchangeableRectangles(int[][] rectangles) {
        double arr[]=modify(rectangles);
        HashMap<Double,Integer> hs=new HashMap();
        long res=0;
        for(int i=0;i<arr.length;i++){
            res+=hs.getOrDefault(arr[i],0);
            hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}