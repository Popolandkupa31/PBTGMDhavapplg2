/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorpack;

/**
 *
 * @author HP
 */
public class Kalkulator {
    // Method pengurangan dengan parameter integer
    public int pengurangan(int a, int b) {
        return a - b;
    }
        
        //Method pembagian dengan parameter float
    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }

    // Method perkalian dengan parameter float
    public float perkalian(float a, float b) {
        return a * b;
    }
}

