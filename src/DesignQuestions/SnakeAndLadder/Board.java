package DesignQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    public Board(int boardSize, int snakes, int ladders){
        initializeBoard(boardSize);
        addSnakesAndLadders(snakes, ladders);
    }

    private void initializeBoard(int boardSize){

        cells = new Cell[boardSize][boardSize];

        for(int i=0; i<boardSize; i++){
            for(int j=0;j<boardSize; j++){
                Cell currentCell = new Cell();
                cells[i][j] = currentCell;
            }
        }
    }

    private void addSnakesAndLadders(int snakes, int ladders){
        while(snakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,(cells.length*cells.length)-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,(cells.length*cells.length)-1);

            if(snakeTail>=snakeHead){
                continue;
            }

            Jump jump = new Jump(snakeHead, snakeTail);
            Cell cell = getCell(snakeHead);
            cell.setJump(jump);
            snakes--;
        }

        while(ladders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump(ladderStart, ladderEnd);

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            ladders--;
        }

    }

    public Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardColumn = playerPosition%cells.length;
        return cells[boardRow][boardColumn];
    }

}
