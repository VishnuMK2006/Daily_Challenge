/*Brute force*/
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = 101;
        for (int i = 0; i <= blocks.length() - k; i++) {
            int val = i;
            int count = 0;
            while (val < i + k) {
                if (blocks.charAt(val) == 'W')
                    count++;
                val++;
            }
            min = Math.min(min, count);
        }
        return min;
    }
}

/* method 2 -->1ms */
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W')
                count++;
        }
        int min = count;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W')
                count--;
            if (blocks.charAt(i) == 'W')
                count++;
            min = Math.min(min, count);
        }
        return min;
    }
}
