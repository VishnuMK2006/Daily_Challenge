/* using Hashmap */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum = 0, dup = 0, n = grid.length;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                if (!hs.containsKey(grid[i][j]))
                    hs.put(grid[i][j], 1);
                else
                    dup = grid[i][j];
            }
        }
        sum -= dup;
        int ind = n * n;
        return new int[] { dup, ((ind * (ind + 1)) / 2) - sum };
    }
}