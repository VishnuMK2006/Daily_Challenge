// class Solution {
//     public int[][] merge(int[][] nums) {
//         Arrays.sort(nums,(a,b) ->Integer.compare(a[1],b[1]));
//         int curEnd=Integer.MIN_VALUE;
//         ArrayList temp=new ArrayList(2);
//         ArrayList res=new ArrayList();

//         for(int i[]:nums){
//             if(temp.get(0).intValue()>i[1]){
//                 res.add(temp);
//                 temp=new ArrayList(2);
                
//                 }
//             if(curEnd<i[0]){
//                 curEnd=i[1];
//                 temp.get(0)=i[0];
//                 temp.get(1)=i[1];
//             }
//             else{
//                 temp.get(1)=i[1];
//             }
//         }
//         System.out.println(res);
//         return new int[][]{{1,1}};
//     }
// }

class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b) ->Integer.compare(a[0],b[0]));
        List<int[]> res= new ArrayList();
        int cur[]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cur[1]>=nums[i][0]){
                cur[1]=Math.max(cur[1], nums[i][1]);
            }
            else{
                res.add(cur);
                cur=nums[i];
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}