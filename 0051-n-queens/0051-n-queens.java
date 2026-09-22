import java.util.*;

class Solution {

    public void nQueen(List<String> board, int row, int n,
                       List<List<String>> ans) {

        // Base case
        if (row == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // Place Queen
                char[] chars = board.get(row).toCharArray();
                chars[col] = 'Q';
                board.set(row, new String(chars));

                // Recursive call for next row
                nQueen(board, row + 1, n, ans);

                // Backtrack
                chars[col] = '.';
                board.set(row, new String(chars));
            }
        }
    }

    public boolean isSafe(List<String> board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    public List<List<String>> solveNQueens(int n) {

        List<String> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        // Create empty board
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        nQueen(board, 0, n, ans);

        return ans;
    }
}