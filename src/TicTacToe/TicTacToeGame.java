package TicTacToe;

import TicTacToe.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    Board gameBoard;

    Deque<Player> players;

    public TicTacToeGame(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();
        Player player1 = new Player("Player 1", new PlayingPieceX());
        Player player2 = new Player("Player 2", new PlayingPieceO());

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){

        boolean noWinner = true;

        while(noWinner==true){
            Player player = players.removeFirst();
            gameBoard.printBoard();

            Integer freeCells = gameBoard.getFreeCells();
            if(freeCells==0){
                noWinner = false;
                continue;
            }

            System.out.print("Player:" + player.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAdded = gameBoard.addPiece(inputRow, inputColumn, player.getPlayingPiece());

            if(!pieceAdded){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(player);
                continue;
            }

            players.addLast(player);

            boolean isThereWinner = isThereWinner(inputRow, inputColumn, player.getPlayingPiece().getPieceType());

            if(isThereWinner){
                return player.getName();
            }
        }

        return "tie";

    }

    public Boolean isThereWinner(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.getSize();i++) {

            if(gameBoard.getBoard()[i][column] == null || gameBoard.getBoard()[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.getSize();i++,j++) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.getSize()-1; i<gameBoard.getSize();i++,j--) {
            if (gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }


        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
