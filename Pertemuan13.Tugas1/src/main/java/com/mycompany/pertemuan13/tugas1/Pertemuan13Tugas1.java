/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13.tugas1;

/**
 *
 * @author HP
 */
public class Pertemuan13Tugas1 {
    class CalculatorSederhana {
        
        public int tambah(int a, int b) {
            return a + b;
        }
        
        public int kurang(int a, int b) {
            return a - b;
        }
        
        public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException ("Pembagi tidak boleh nol.");
        }
        return a / b;
        }
}
    
public static void main(String[] args) {
    Pertemuan13Tugas1 objekluar = new Pertemuan13Tugas1();
    CalculatorSederhana kalkulator = objekluar.new CalculatorSederhana();
    
    System.out.println("Hasil Pertambahan :" + kalkulator.tambah(20, 10));
    System.out.println("Hasil Pengurangan :" + kalkulator.tambah(20, 10));
    System.out.println("Hasil Perkalian :" + kalkulator.tambah(20, 10));
    System.out.println("Hasil Pembagian :" + kalkulator.tambah(20, 10));
  }
}

    

