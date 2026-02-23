/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.herts.hk24aas.gittest;

/**
 *
 * @author harshdeepkumar
 */
public class Complex 
{
    private double real;
    private double imaginary;
    
    Complex(double real, double imaginery)
    {
        this.real = real;
        this.imaginary = imaginery;
    }
    Complex(double real)
    {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    public Complex add(Complex other)
    {
        return other;
    }
    public Complex subtract(Complex other)
    {
        return other;
    }
 
    
}