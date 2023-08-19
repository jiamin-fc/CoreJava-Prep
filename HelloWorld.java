/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class HelloWorld {
    private int numerator;
    private int denominator;
    
    //method to compare instances of Fraction
    public boolean isEqual(HelloWorld fNum) {
        int nuValue1 = numerator * fNum.denominator;
        int nuValue2 = denominator * fNum.numerator;
        return (nuValue1 == nuValue2);
        
    }
    
    //Get method
    public int GetNumerator() {
        return numerator;
    }
    public int GetDenominator() {
        return denominator;
    }
    public void setNumerator(int newNu) {
        numerator = newNu;
    }
    public void setDenominator(int newDe) {
        denominator = newDe; // setting the constructor
        if (newDe < 0) {
            numerator = numerator * -1;
            denominator = newDe * -1;
        }
        else {
            denominator = newDe;
        }
        
        
        
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
