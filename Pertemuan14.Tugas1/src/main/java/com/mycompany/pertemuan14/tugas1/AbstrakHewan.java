/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan14.tugas1;

/**
 *
 * @author HP
 */
public abstract class AbstrakHewan {
    // method abstract
    public abstract void suara();
    // method non abstract
    public void suara2() {
        System.out.println(" ini method konkrit dari parent class");
    }
}
