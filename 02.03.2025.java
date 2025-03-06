class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        ArrayList<int[]> arr = new ArrayList<>();
        while (i != nums1.length && j != nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                arr.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                arr.add(new int[] { nums1[i][0], nums1[i][1] });
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                arr.add(new int[] { nums2[j][0], nums2[j][1] });
                j++;
            }

        }
        while (i != nums1.length) {
            arr.add(new int[] { nums1[i][0], nums1[i][1] });
            i++;
        }
        while (j != nums2.length) {
            arr.add(new int[] { nums2[j][0], nums2[j][1] });
            j++;
        }
        return arr.toArray(new int[arr.size()][2]);
    }
}