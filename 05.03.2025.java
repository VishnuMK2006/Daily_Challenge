
/* Brute Froce */

class Solution {
    public long coloredCells(int n) {
        if (n == 1)
            return 1;
        return (4 * (n - 1)) + coloredCells(n - 1);
    }
}

/* using Equation */
class Solution {
    public long coloredCells(long n) {
        return ( 2*(n * (n - 1)) + 1);
    }
}

/*
 * 4 * n(n-1)/2 +1
 */
