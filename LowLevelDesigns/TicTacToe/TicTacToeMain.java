package LowLevelDesigns.TicTacToe;

import LowLevelDesigns.TicTacToe.game.Game;

public class TicTacToeMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.initialize();
        game.startGame();
    }
}
