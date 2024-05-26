package com.dev;

class Mahasiswa {
    public int Absen;
    private String Nama;
    private int Nim;

    Mahasiswa() {
        this.Nama = "Ucup";
        this.Nim = 3332039;

    }

    // Getter
    public String getNama() {
        return Nama;
    }

    public int getNim() {
        return Nim;
    }

    // Setter
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNim(int Nim) {
        this.Nim = Nim;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.Absen = 1; // write
        System.out.println("Absen\t: " + mahasiswa1.Absen); // read

        // read only
        String nama = mahasiswa1.getNama();
        System.out.println("Nama\t: " + nama);

        // write only
        mahasiswa1.setNama("Udin");

    }
}