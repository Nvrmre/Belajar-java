package com.dev;

import com.console.Console;

//default visibility 
// hanya bisa di akses dalam satu package yang sama

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void show() {

        // System.out.println("Nama = " + this.name);
        Console.log("Nama Player = " + this.name);
    }

}
