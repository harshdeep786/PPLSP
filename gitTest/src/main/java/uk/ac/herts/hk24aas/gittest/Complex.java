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

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }
    
    public Complex add(Complex other)
    {
        return new Complex(getRealPart() + other.getRealPart());        
    }
    public Complex subtract(Complex other)
    {
        return new Complex(getRealPart() - other.getRealPart(), getImaginaryPart() - other.getImaginaryPart());
    }
    
    public Complex multiply(Complex other)
    {
        return new Complex(getRealPart() * other.getRealPart(), getImaginaryPart() * other.getImaginaryPart());
    }
 
    public Complex divide(Complex other)
    {
        return new Complex(getRealPart() / other.getRealPart(), getImaginaryPart() / other.getImaginaryPart());
    }
}