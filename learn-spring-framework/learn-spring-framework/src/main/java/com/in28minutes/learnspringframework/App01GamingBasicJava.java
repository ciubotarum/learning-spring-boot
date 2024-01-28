package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {  // we will rename AppGamingBasicJava
    public static void main(String[] args) {

//        var marioGame = new MarioGame();
//        var game = new MarioGame(); // we name MarioGame and SuperContraGame the same.

//        var superContraGame = new SuperContraGame();
//        var game = new SuperContraGame();

//        var gameRunner = new GameRunner(marioGame);
//        var gameRunner = new GameRunner(superContraGame);

        // exercise PacmanGame
        var game = new PacmanGame();  // 1: Object Creation
        var gameRunner = new GameRunner(game); // 2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();
    }

}
