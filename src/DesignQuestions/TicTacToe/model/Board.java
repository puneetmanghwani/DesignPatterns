package DesignQuestions.TicTacToe.model;



public class Board {

    private int size;

    private PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public Boolean addPiece(int row, int column, PlayingPiece playingPiece){

        if(row>= board.length || column>=board[0].length || board[row][column]!=null){
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }

    public int getFreeCells(){
        int freeCells = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells++;
                }
            }
        }

        return freeCells;

    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
