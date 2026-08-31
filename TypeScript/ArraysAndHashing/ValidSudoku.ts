function isValidSudoku(board: string[][]): boolean {
    for (let i = 0; i < 9; i++) {
        const rowSet = new Set<string>();
        const colSet = new Set<string>();
        const boxSet = new Set<string>();

        for (let j = 0; j < 9; j++) {
            const rowCell = board[i][j];
            if (rowCell !== '.') {
                if (rowSet.has(rowCell)) return false;
                rowSet.add(rowCell);
            }

            const colCell = board[j][i];
            if (colCell !== '.') {
                if (colSet.has(colCell)) return false;
                colSet.add(colCell);
            }

            const boxRow = Math.floor(i / 3) * 3 + Math.floor(j / 3);
            const boxCol = (i % 3) * 3 + (j % 3);
            const boxCell = board[boxRow][boxCol];
            if (boxCell !== '.') {
                if (boxSet.has(boxCell)) return false;
                boxSet.add(boxCell);
            }
        }
    }

    return true;
}
