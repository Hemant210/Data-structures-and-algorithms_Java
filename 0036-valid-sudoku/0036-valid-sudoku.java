import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use sets to track seen numbers in rows, columns, and boxes
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    String row = "row" + i + current;
                    String col = "col" + j + current;
                    String box = "box" + (i / 3) + (j / 3) + current;

                    // Check if any number is repeated
                    if (!seen.add(row) || !seen.add(col) || !seen.add(box)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}