// Last updated: 11/08/2026, 21:24:32
class Solution {
    private boolean[][] rows = new boolean[9][10];
    private boolean[][] cols = new boolean[9][10];
    private boolean[][] boxes = new boolean[9][10];
    public void solveSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    int num = board[r][c] - '0';
                    rows[r][num] = true;
                    cols[c][num] = true;
                    boxes[boxIndex(r, c)][num] = true;
                }
            }
        }
        solve(board);
    }
    private boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    for (int num = 1; num <= 9; num++) {
                        int box = boxIndex(r, c);
                        if (!rows[r][num] &&
                            !cols[c][num] &&
                            !boxes[box][num]) {
                            board[r][c] = (char) (num + '0');
                            rows[r][num] = true;
                            cols[c][num] = true;
                            boxes[box][num] = true;
                            if (solve(board)) {
                                return true;
                            }
                            board[r][c] = '.';
                            rows[r][num] = false;
                            cols[c][num] = false;
                            boxes[box][num] = false;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private int boxIndex(int r, int c) {
        return (r / 3) * 3 + (c / 3);
    }
}