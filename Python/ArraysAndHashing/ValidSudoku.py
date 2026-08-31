class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        for i in range(9):
            row_set = set()
            col_set = set()
            box_set = set()

            for j in range(9):
                row_cell = board[i][j]
                if row_cell != '.':
                    if row_cell in row_set:
                        return False
                    row_set.add(row_cell)

                col_cell = board[j][i]
                if col_cell != '.':
                    if col_cell in col_set:
                        return False
                    col_set.add(col_cell)

                box_row = (i // 3) * 3 + (j // 3)
                box_col = (i % 3) * 3 + (j % 3)
                box_cell = board[box_row][box_col]
                if box_cell != '.':
                    if box_cell in box_set:
                        return False
                    box_set.add(box_cell)

        return True
