package com.data;

public class Ruang {
    public int p;
    public int l;
    private static double luas;

    Ruang(int p, int l) {
        this.luas = p * l;
    }

    public void showLuas() {
        System.out.println(luas);
    }

    public static double getLuas() {
        return luas;
    }

    public static void main(String[] args) {

        Ruang ruang = new Ruang(90, 70);

        double luasruangan = getLuas();
        System.out.println(luasruangan);
    }
}
