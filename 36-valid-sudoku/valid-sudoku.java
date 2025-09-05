import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 3x3 matrix check
        for (int rowlimit = 0; rowlimit < 9; rowlimit += 3) {
            for (int collimit = 0; collimit < 9; collimit += 3) {
                HashMap<Character, Integer> hs = new HashMap<>();
                for (int row = rowlimit; row < rowlimit + 3; row++) {
                    for (int col = collimit; col < collimit + 3; col++) {
                        if (board[row][col] != '.') {
                            if (hs.containsKey(board[row][col]))
                                return false;
                            else
                                hs.put(board[row][col], 1);
                        }
                    }
                }
            }
        }

        // Row check
        for (int row = 0; row < 9; row++) {
            HashMap<Character, Integer> hs = new HashMap<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    if (hs.containsKey(board[row][col]))
                        return false;
                    else
                        hs.put(board[row][col], 1);
                }
            }
        }

        // Column check
        for (int col = 0; col < 9; col++) {
            HashMap<Character, Integer> hs = new HashMap<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] != '.') {
                    if (hs.containsKey(board[row][col]))
                        return false;
                    else
                        hs.put(board[row][col], 1);
                }
            }
        }

        return true;
    }
}