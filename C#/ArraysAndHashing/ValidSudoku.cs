using System.Collections.Generic;

public class Solution
{
    public bool IsValidSudoku(char[][] board)
    {
        for (int i = 0; i < 9; i++)
        {
            HashSet<char> rowSet = new HashSet<char>();
            HashSet<char> colSet = new HashSet<char>();
            HashSet<char> boxSet = new HashSet<char>();

            for (int j = 0; j < 9; j++)
            {
                char rowCell = board[i][j];
                if (rowCell != '.' && !rowSet.Add(rowCell))
                    return false;

                char colCell = board[j][i];
                if (colCell != '.' && !colSet.Add(colCell))
                    return false;

                int boxRow = (i / 3) * 3 + (j / 3);
                int boxCol = (i % 3) * 3 + (j % 3);
                char boxCell = board[boxRow][boxCol];

                if (boxCell != '.' && !boxSet.Add(boxCell))
                    return false;
            }
        }

        return true;
    }
}
