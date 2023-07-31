package DesignQuestions.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;

    Deque<Player> players= new LinkedList<>();

    Player winner;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;

        addPlayers();
    }

    public void addPlayers(){
        Player player1 = new Player("p1",0);
        Player player2 = new Player("p2",0);

        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        while(winner==null){
            Player playerTurn = findPlayer();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);

            int diceNumbers = dice.roll();

            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);

            if(playerNewPosition>=(board.cells.length * board.cells.length)-1){
                winner = playerTurn;
            }
        }

        System.out.println("WINNER IS:" + winner.id);
    }

    private int jumpCheck(int playerNewPosition){
        if(playerNewPosition > (board.cells.length * board.cells.length)-1){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump!=null && cell.jump.start==playerNewPosition){
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.end;
        }

        return playerNewPosition;
    }

    private Player findPlayer(){
        Player player = players.removeFirst();
        players.addLast(player);
        return player;
    }
}

