package LowLevelDesigns.TicTacToe.models;

public abstract class Piece {
    PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPiece() {
        return pieceType;
    }

    public void setPiece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
