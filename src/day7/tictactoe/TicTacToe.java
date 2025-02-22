package day7.tictactoe;

public class TicTacToe {
    // 初始化
    private Board board = new Board();
    private char currentMove;

    // play
    public void makeMove(int row, int col) {
        board.makeMove(row,col, currentMove);
        if(board.checkWin()){
            System.out.println("You win!" + currentMove);
        }
        if(board.isBoardFull){
            System.out.println("Tie");
        }
        changePlayer();
    }

    private void changePlayer() {
        System.out.println("TicTacToe.changePlayer");
    }
    // check-win


}
