/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13.tugas2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Pertemuan13Tugas2 {
    public class Segitiga {
            private double alas;
            private double tinggi;
            private double luas;
            
            public Segitiga() {
            this.alas = 0;
            this.tinggi = 0;
            this.luas = 0;
        }
            public Segitiga(double alas, double tinggi) {
                this.alas = alas;
                this.tinggi = tinggi;
                this.luas = hitungLuas(alas, tinggi); // Hitung luas menggunakan dua parameter
            }
            
            public double getAlas() {
                return alas;
            }
            
            public void setAlas (double alas) {
                this.alas = alas;
                this.luas = hitungLuas(alas, this.tinggi); // Hitung ulang luas jika alas berubah
            }
            
            public double getTinggi () {
                return tinggi;
            }
            
            public void setTinggi(double tinggi) {
                this.tinggi = tinggi;
                this.luas = hitungLuas(this.alas, tinggi); // Hitung ulang luas jika tinggi berubah
            }
            
            public double getLuas() {
                return luas;
            }
            
            public double hitungLuas(double alas, double tinggi) {
                return (alas * tinggi) / 2;
            }
            
            // Metode untuk menghitung luas dengan objek segitiga sebagai parameter
            public double hitungLuas(Segitiga segitiga) {
                return hitungLuas(segitiga.getAlas(), segitiga.getTinggi());
            }
            
            public void tampilkanData() {
                System.out.println("Alas: " +alas);
                System.out.println("Tinggi: " +tinggi);
                System.out.println("Luas: " +luas);
            }
    }
            
    public static void main(String[] args) {
        Scanner myInput = new Scanner (System.in);
        System.out.println("Masukan alas segitiga: ");
        double alas = myInput.nextDouble();
        
        System.out.println("Masukan tinggi segitiga:" );
        double tinggi = myInput.nextDouble();
      
        // Membuat instance dari Segitiga dengan input dari pengguna
        Pertemuan13Tugas2 objekLuar = new Pertemuan13Tugas2();
        Segitiga segitiga = objekLuar.new Segitiga(alas, tinggi);

        // Menampilkan hasil
        System.out.println("\nInformasi Segitiga: ");
        segitiga.tampilkanData();
    }
  }
