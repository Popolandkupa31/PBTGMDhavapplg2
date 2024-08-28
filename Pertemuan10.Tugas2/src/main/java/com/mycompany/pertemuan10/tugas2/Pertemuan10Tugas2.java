/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10.tugas2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Pertemuan10Tugas2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan1: ");
        double bilangan1 = myInput.nextDouble();
        System.out.println("Masukkan bilangan2: ");
        double bilangan2 = myInput.nextDouble();
        
        Aritmatika aritmatika = new Aritmatika(bilangan1, bilangan2);

        // Mengakses dan menampilkan hasil metode pengurangan
        System.out.println("Hasil Pengurangan: " + aritmatika.pengurangan());

        // Mengakses dan menampilkan hasil metode perkalian
        System.out.println("Hasil Perkalian: " + aritmatika.perkalian());

        // Mengakses dan menampilkan hasil metode pembagian
        try {
            System.out.println("Hasil Pembagian: " + aritmatika.pembagian());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil metode pangkat
        System.out.println("Hasil Pangkat: " + aritmatika.pangkat());
    }
}
