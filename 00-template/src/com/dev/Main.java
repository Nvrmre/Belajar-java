package com.dev;

//class dengan constructor
class Mahasiswa {

    String nama;
    String Alamat;
    String NIM;

    //constructor, nama constructor = nama class
    Mahasiswa(String Inputnama, String inputAlamat, String inputNIM) {

        nama = Inputnama;
        Alamat = inputAlamat;
        NIM = inputNIM;

        System.out.println(nama);
        System.out.println(Alamat);
        System.out.println(NIM);
    }

}

public class Main {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","bumiayu","3222123");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi","jawa","423145161");
        Mahasiswa mahasiswa3 = new Mahasiswa("yohanes","buhu","44443221");

       
        // mahasiswa.nama = "Saya";
        // mahasiswa.NIM = 42422049;
        // mahasiswa.Alamat = "Bumiayu";

        // System.out.println("Nama mahasiswa " + mahasiswa.nama);
        // System.out.println("NIM " + mahasiswa.NIM);
        // System.out.println("Alamat " + mahasiswa.Alamat);

    }
}
