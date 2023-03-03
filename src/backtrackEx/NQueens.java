package backtrackEx;

import java.util.*;

class NQueens {
    static void saveBoard(char[][] board,List<List<String>> allboards){
        String row="";
        List<String> newBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row += "Q";
                }
                else{
                    row+=".";
                }
            }
            newBoard.add(row);
        }
        allboards.add(newBoard);
    }

    static boolean queenSafe(int row, int col, char[][] board) {
        //horizontal
        for(int i=0;i<board.length;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }

        //vertical
        for(int j=0;j<board.length;j++){
            if(board[j][col]=='Q'){
                return false;
            }
        }

        //upper left
        for(int r=row,c=col;r>=0 && c>=0;r--,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
        for(int r=row,c=col;r>=0 && c<board.length;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        for(int r=row,c=col;r<board.length && c>=0;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        for(int r=row,c=col;r<board.length && c<board.length;r++,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    static void helper(char[][] board, List<List<String>> allboards, int col) {
        if (col == board.length) {
            saveBoard(board, allboards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (queenSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allboards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    static void solveNQueens(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allboards, 0);
        System.out.println(allboards);
    }

    public static void main(String args[]){
        solveNQueens(4);
    }
}
