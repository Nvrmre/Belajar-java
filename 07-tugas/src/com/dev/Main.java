package com.dev;

import com.data.Jumlah_mahasiswa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        int j_MHS, j_KRSi;

        System.out.println("Tentukan ruang kelas");
        System.out.print("jumlah mahasiswa = ");
        j_MHS = input.nextInt();
        System.out.print("\n");

        System.out.print("Jumlah kursi = ");
        j_KRSi = input.nextInt();

        if (j_KRSi - j_MHS != 0) {

            System.out.println("RUANGAN TERLALU BESAR ATAU TERLALU KECIL");
        } else {
            System.out.println("RUANGAN SESUAI DENGAN KELAS ANDA, SILAHKAN SESUAIKAN JADWAL");
        }

   
    
    
    }
}