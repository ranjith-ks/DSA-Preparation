/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(exist(board,word,i,j,0))
                    return true;
        return false;
    }
    private boolean exist(char[][] board,String word,int row,int col,int idx)
    {
        if(idx==word.length())
            return true;
        if(row<0 || col<0 || row==board.length || col==board[0].length || board[row][col]!=word.charAt(idx))
            return false;
        char c = board[row][col];
        board[row][col] = ' ';
        idx++;
        boolean res = exist(board,word,row-1,col,idx) || exist(board,word,row+1,col,idx) || exist(board,word,row,col-1,idx) || exist(board,word,row,col+1,idx);
        board[row][col] = c;
        return res;
    }
}