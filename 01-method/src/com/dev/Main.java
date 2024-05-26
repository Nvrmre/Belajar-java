package com.dev;

class Mahasiswa {

    String Nama = "Saya";
    String NIM = "322222";

    Mahasiswa(String Nama, String NIM) {
        this.Nama = Nama;
        this.NIM = NIM;

    }

    // method tanpa return dan tanpa parameter
    void show() {

        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM  : " + this.NIM);

    }

    // method dengan parameter tanpa return
    void setName(String nama) {
        this.Nama = nama;
    }

    // method dengan return tanpa parameter
    String getName() {
        return this.Nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan parameter dan dengan return
    String sayHi(String message) {
        return message + " nama saya " + this.Nama;
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa("Gupron", "2223312");

        mahasiswa.setName("budi");
        mahasiswa.show();
        System.out.println(mahasiswa.getName());
        System.out.println(mahasiswa.getNIM());
        System.out.println(mahasiswa.sayHi("hallo "));

    }

}
