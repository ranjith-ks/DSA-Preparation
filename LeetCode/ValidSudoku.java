/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:
A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        int i,j;
        char c;
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                c = board[i][j];
                if(c!='.')
                {
                    if(! (set.add(c+" int Row : "+i) && set.add(c+" int Col : "+j) && set.add(c+" int Grid : "+i/3+" "+j/3)))
                        return false;
                }
            }
        }
        return true;
    }
}