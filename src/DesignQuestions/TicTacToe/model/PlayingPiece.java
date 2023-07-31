package DesignQuestions.TicTacToe.model;

public abstract  class PlayingPiece {

    PieceType pieceType;

    public PieceType getPieceType() {
        return pieceType;
    }

    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }

}
