package LowLevelDesigns.TicTacToe.models;

public class Player {
    String name;
    Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPlayerPiece() {
        return piece;
    }

    public void setPlayerPiece(Piece piece) {
        this.piece = piece;
    }
}
