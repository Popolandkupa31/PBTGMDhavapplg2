/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11.tugas2;

/**
 *
 * @author HP
 */
public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private int golongan;
    private String jabatan;
    private double gajiPokok;
    
public Karyawan(String idKaryawan, String namaKaryawan, int golongan, String jabatan, double gajiPokok) {
  this.idKaryawan = idKaryawan;
  this.namaKaryawan = namaKaryawan;
  this.golongan = golongan;
  this.jabatan = jabatan;
  this.gajiPokok = gajiPokok;
}
public String getIdKaryawan() {
    return idKaryawan;
}

public void setIdkaryawan(String idKaryawan) {
    this.idKaryawan = idKaryawan;
}

public String getNamaKaryawan() {
    return namaKaryawan;
}

public void setNamaKaryawan(String namaKaryawan) {
    this.namaKaryawan = namaKaryawan;
}

public int getGolongan() {
    return golongan;
}

public void setGolongan(int golongan) {
    this.golongan = golongan;
}

public String getJabatan() {
    return jabatan;
}

public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
}

public double getGajipokok() {
    return gajiPokok;
}

public void setGajipokok(double gajipokok) {
    this.gajiPokok = gajipokok;
}

public void tampilkanData() {
    System.out.println("ID Karyawan: " + idKaryawan);
    System.out.println("Nama Karyawan: " + namaKaryawan);
    System.out.println("Golongan: " + golongan);
    System.out.println("Jabatan: " + jabatan);
    System.out.println("Gaji pokok: " + gajiPokok);
    
    }
}
