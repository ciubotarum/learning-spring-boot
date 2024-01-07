package com.object_oriented_programming_2.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};

        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();
        }
//        MarioGame game = new MarioGame();
//        ChessGame game = new ChessGame();
//        GamingConsole game = new MarioGame();
//        game.up();
//        game.down();
//        game.left();
//        game.right();
    }
}
