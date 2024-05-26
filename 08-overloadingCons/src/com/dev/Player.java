package com.dev;

public class Player {
    private String name;
    private static int jumlahplayer;

    /** overloading constructor **/

    // opsi 1
    Player(String name) {
        Player.jumlahplayer++;
        this.name = name;
    }

    // opri 2
    Player() {
        Player.jumlahplayer++;
        this.name = "Saia" + Player.jumlahplayer;
    }

    void show() {
        System.out.println("Player Name : " + this.name);
    }
}
