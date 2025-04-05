package LowLevelDesigns.TicTacToe.models;

public class Board {
    int size;
    PieceType[][] boardLayout;

    public Board(int size) {
        this.size = size;
        boardLayout = new PieceType[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(boardLayout[i][j] == null ? " " : boardLayout[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean addPiece(int row, int column, Piece player) {
        if (row >= size || column >= size || row < 0  || column < 0) {
            return false;
        }

        if (boardLayout[row][column] != null) {
            return  false;
        }

        boardLayout[row][column] = player.getPiece();
        return true;
    }

    public boolean anyFreeCellPresent() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boardLayout[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<size;i++) {

            if(boardLayout[row][i] == null || boardLayout[row][i] != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<size;i++) {

            if(boardLayout[i][column] == null || boardLayout[i][column] != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<size;i++,j++) {
            if (boardLayout[i][j] == null || boardLayout[i][j] != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=size-1; i<size;i++,j--) {
            if (boardLayout[i][j] == null || boardLayout[i][j] != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
