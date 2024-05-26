package com.dev;

class Display {

    static String type = "tampil";
    private String Nama;

    Display(String Nama) {
        this.Nama = Nama;

    }

    // public void setName(String nama) {
    // this.type = type;
    // }

    // public String getName() {
    // return Nama;
    // }
    public void show() {

        System.out.println("Display name = " + this.Nama);
    }
}

public class Main {

    public static void main(String[] args) {

        Display display1 = new Display("monitor");
        display1.show();

        Display display2 = new Display("Pamflet");
        display2.show();

        System.out.println("\nmenampilkan static variable ");
        System.out.println(Display.type);

    }
}

// Static attribute akan membuat suatu class variabel menempel pada class
//