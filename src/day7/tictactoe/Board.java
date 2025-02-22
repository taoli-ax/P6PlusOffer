package day7.tictactoe;

public class Board {
    public boolean isBoardFull;
    private char[][] board;

    public Board() {
    }
    public void initializeBoard(){
        board = new char[3][3];
    }

    public void makeMove(int row, int col, char currentMove) {

    }

    public boolean checkWin() {
        //check full
        // 连续3个
        return false;
    }

}
