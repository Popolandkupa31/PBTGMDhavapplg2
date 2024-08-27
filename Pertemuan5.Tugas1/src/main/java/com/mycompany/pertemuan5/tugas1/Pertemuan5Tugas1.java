/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5.tugas1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Pertemuan5Tugas1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Nama Anda:");
        // String input
        String name = myInput.nextLine();
        // Numerical input
        System.out.println("Masukan Alamat Anda:");
        // String input
        String addres = myInput.nextLine();
        // Numerical input
        System.out.println("Masukan Usia Anda:");
        int age = myInput.nextInt();
        System.out.println("Masukan Gaji Anda:");
        double salary = myInput.nextDouble();
    // Output imput by user
    System.out.println(" Pendataan Karyawan PT. Petani Kode: ");
    System.out.println(" Nama Karyawan : " + name);
    System.out.println(" Alamat : " + addres);
    System.out.println("Usia : " + age);
    System.out.println("Gaji: " + salary);
    }
}
