/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15.tugas1;
import kalkulatorpack.Kalkulator;
/**
 *
 * @author HP
 */
public class Pertemuan15Tugas1 {

    public static void main(String[] args) {
       // Membuat objek dari kelas Kalkulator
       Kalkulator objek = new Kalkulator();
       
       // Menggunakan method pengurangan
       int hasilPengurangan = objek.pengurangan(30, 10);
       System.out.println("Hasil Pengurangan: " + hasilPengurangan);
       
       // Menggunakan method pembagian
       try {
           float hasilPembagian = objek.pembagian(10.0f, 2.0f);
           System.out.println("Hasil Pembagian: + hasilPembagian");
       } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       }
    }
}