package com.loops;

public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(90);

//        System.out.println(player.printSquaresUptoLimit());
        player.printSquaresUptoLimit();
        System.out.println();
        player.printCubesUptoLimit();

    }
}
