package com.dev;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("saya");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("kamu");

        // overloading pada constructor

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading pada method
        int a = Matematika.tambah(1, 4);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.88);
        System.out.println(b);

    }
}
