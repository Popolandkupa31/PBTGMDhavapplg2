/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11.tugas1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Pertemuan11Tugas1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner (System.in);
        
        System.out.println("Masukan ID Karyawan");
        String idKaryawan = myInput.nextLine();
        
        System.out.println("Masukan Nama Karyaawan");
        String namaKaryawan = myInput.nextLine();
        
        
        System.out.println("Masukan Golongan");
        String golongan = myInput.nextLine();
        
        
        System.out.println("Masukan Jabatan");
        String jabatan = myInput.nextLine();
        
        System.out.println("Masukan Gaji Pokok");
        double gajiPokok = myInput.nextDouble();
        
        // Membuat objek karyawan dengan kata yang diinput
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);
        
        // Menampilkan data karyawan
        System.out.println("\nData Karyawan");
        karyawan.tampilkanData();
    }
}
