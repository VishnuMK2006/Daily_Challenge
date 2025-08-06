class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        int max=-1;
        for(int i=0;i<left.length;i++){
            if(max<height[i])
                max=height[i];
            left[i]=max;
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--){
            if(max<height[i])
                max=height[i];
            right[i]=max;
        }
        int res=0;
        for(int i=0;i<height.length;i++){
            res+= Math.min(left[i],right[i]) - height[i];
        }
        return res;
    }
}