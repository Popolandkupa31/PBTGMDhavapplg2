/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11.tugas2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Pertemuan11Tugas2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
       
        System.out.println("Masukan ID Karyawan: ");
        String idKaryawan = myInput.nextLine();
        
        System.out.println("Masukan Nama Karyawan: ");
        String namaKaryawan = myInput.nextLine();
        
        System.out.println("Masukan Golongan (1-5): ");
        int golongan = myInput.nextInt();
        myInput.nextLine();
        
        System.out.println("Masukan Jabatan: ");
        String jabatan = myInput.nextLine();
        
        
     double gajiPokok = switch (golongan) {
        case 1 -> 3000000;
        case 2 -> 3500000;
        case 3 -> 4000000;
        case 4 -> 5000000;
        case 5 -> 6000000;
        default -> {
             System.out.println("Golongan tidak valid, gaji pokok ditetapkan ke 0.");
             yield 0;
        }
    };
     

Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);


System.out.println("\nData Karyawan");
karyawan.tampilkanData();


myInput.close();
  }
}