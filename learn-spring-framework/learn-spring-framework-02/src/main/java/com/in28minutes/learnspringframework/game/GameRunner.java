package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//    MarioGame game;
//    private SuperContraGame game;
    private GamingConsole game; // in that way we can run the game we want without change the constructor every time

//    public GameRunner(MarioGame game) {
//        this.game = game;
//    }
//public GameRunner(SuperContraGame game) {
//    this.game = game;
//}

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
