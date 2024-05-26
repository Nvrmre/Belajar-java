package com.dev;

//keyword import package 
import com.console.Console;

// import static method dari console
import static com.console.Console.log;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Budi");

        player1.show();
        Console.log("hell no");

        Console.log(player1.getName());
        log(player1.getName());
    }
}
