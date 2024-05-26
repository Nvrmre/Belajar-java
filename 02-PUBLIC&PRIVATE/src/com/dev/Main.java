package com.dev;

class Buku {
    String Judul; // default
    public String penulis; // public key
    private int Halaman; // private key
    private int peminjam;

    Buku(String Judul, String penulis, int Halaman, int peminjam) {
        this.Judul = Judul;
        this.penulis = penulis;
        this.Halaman = Halaman;
        this.peminjam = peminjam;

    }

    // default modifier access
    void display() {
        tambahPeminjam();
        System.out.println("\njudul\t:" + this.Judul);
        System.out.println("penulis\t:" + this.penulis);
        System.out.println("halaman\t:" + this.Halaman);
        System.out.println("jumlah peminjam\t" + this.peminjam);
    }

    public void ubahPenulis(String ubahPenulis) {
        this.penulis = ubahPenulis;
    }

    private void tambahPeminjam() {
        this.peminjam += 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Mencari secercah asa", "heru", 100, 1);

        // default
        // bisa di akses
        buku.Judul = "harapan baru"; // dapat ditulis ulang
        System.out.println(buku.Judul); // dapat ditampilkan

        // public key
        buku.penulis = "Sato Yakizuki";// dapat ditulis ulang
        System.out.println(buku.penulis); // dapat di tampilkan

        // private key
        // buku.Halaman = 299; // tidak dapat ditulis ulang
        // System.out.println(buku.Halaman); // tidakdapat ditampilkan

        buku.display();

        // public
        buku.ubahPenulis("Burhan");
        buku.display();

        buku.ubahPenulis("tejo");
        buku.display();
        // private

    }
}