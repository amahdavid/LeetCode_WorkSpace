import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char rowCell = board[i][j];
                if (rowCell != '.' && !rowSet.add(rowCell)) return false;

                char colCell = board[j][i];
                if (colCell != '.' && !colSet.add(colCell)) return false;

                int boxRow = (i / 3) * 3 + (j / 3);
                int boxCol = (i % 3) * 3 + (j % 3);
                char boxCell = board[boxRow][boxCol];
                if (boxCell != '.' && !boxSet.add(boxCell)) return false;
            }
        }

        return true;
    }
}
