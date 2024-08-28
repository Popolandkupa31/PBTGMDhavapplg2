/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12.tugas1;

/**
 *
 * @author HP
 */
public class Pertemuan12Tugas1 {

    
        class pegawai {
        int gaji = 4000000;
        int tunjanganMakan = 400000;
        int transport = 500000;
        int bonus = 1000000;
    }
    class SystemAnalyst extends pegawai {
        public int hitungGajiTotal() {
            return gaji + bonus + tunjanganMakan + transport;
        }
    }
    
    public static void main(String args[]) {
            Pertemuan12Tugas1 outer = new Pertemuan12Tugas1 ();
            SystemAnalyst SA = outer.new SystemAnalyst();
            
            System.out.println("Gaji System Analyst : "+SA.gaji); 
            System.out.println("Bonus : "+SA.bonus); 
            System.out.println("Tunjangan Makan : "+SA.tunjanganMakan); 
            System.out.println("Transport : "+SA.transport); 
            System.out.println("Gaji Total : "+SA.hitungGajiTotal());
    }
}
