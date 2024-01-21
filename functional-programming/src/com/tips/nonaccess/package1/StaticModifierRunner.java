package com.tips.nonaccess.package1;

class Player {
    private String name;
//    private int count;
    private static int count = 0; // for all instances
    public Player(String name) {
        super();
        this.name = name;
        count++;
    }

    static public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo");
        Player player2 = new Player("Federer");
        System.out.println(player1.getCount());
        System.out.println(player2.getCount());

    }
}
