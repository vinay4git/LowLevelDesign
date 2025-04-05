package LowLevelDesigns.TicTacToe.game;

import LowLevelDesigns.TicTacToe.models.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

    Queue<Player> playerQueue;
    Board board;
    Scanner scanner;

    public void initialize() {
        playerQueue = new LinkedList<>();

        Player player1 = new Player("player1", new PieceO());
        playerQueue.add(player1);

        Player player2 = new Player("player2", new PieceX());
        playerQueue.add(player2);

        board = new Board(3);

        scanner = new Scanner(System.in);
    }

    public void startGame() {
        boolean gameDone = false;
        System.out.println("Start the game:");
        while (!gameDone) {
            Player currentPlayer = playerQueue.peek();
            board.printBoard();
            System.out.print("Select the empty position enter row and column" + currentPlayer.getName() + ":");

            String position = scanner.nextLine();
            String[] inputRowColumn = position.split(",");
            int row = Integer.parseInt(inputRowColumn[0]);
            int column = Integer.parseInt(inputRowColumn[1]);

            boolean positioneCaptured = board.addPiece(row, column, currentPlayer.getPlayerPiece());

            if (!positioneCaptured) {
                System.out.println(" Enter Valid coordinates with , separated: ");
                continue;
            }

            if(board.isWinner(row, column, currentPlayer.getPlayerPiece().getPiece())) {
                System.out.println("player " + currentPlayer.getName() + " is the winner");
                return;
            }

            if (!board.anyFreeCellPresent()) {
                gameDone =  true;
            }
            playerQueue.remove();
            playerQueue.add(currentPlayer);
        }
        System.out.println("player TIE is the winner");
    }

}
