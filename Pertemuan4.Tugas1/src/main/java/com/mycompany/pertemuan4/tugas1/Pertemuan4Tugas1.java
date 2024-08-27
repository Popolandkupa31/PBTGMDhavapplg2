/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan4.tugas1;

/**
 *
 * @author HP
 */
public class Pertemuan4Tugas1 {

    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 3;

        int hasilPenambahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        double hasilPembagian = (double) angka1 / angka2;

        System.out.println("a. Hasil Pertambahan A+B = " + hasilPenambahan);
        System.out.println("b. Hasil Pengurangan A-B = " + hasilPengurangan);
        System.out.println("c. Hasil Perkalian A*B = " + hasilPerkalian);
       System.out.printf("d. Hasil Pembagian A/B  = %.6f\n", hasilPembagian);
    }
}
