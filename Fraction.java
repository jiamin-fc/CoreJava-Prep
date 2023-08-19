/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */


// f1.add(f2);

public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction add(Fraction fracNum) {
        int newNumerator = numerator * fracNum.denominator +
                           denominator * fracNum.numerator; //for cross multiplication, FracNum = Fraction Number
        int newDenominator = denominator * fracNum.denominator;
        // Create new instance to hold the result
        
        Fraction temp = new Fraction(); //new instance, the values will be 0
        temp.numerator = newNumerator;
        temp.denominator = newDenominator;
        temp.simplify(); //simplifying the dynamic values for calculation
        
        //simplify(); -- this will affect f1 of the fractions 
        
        return temp;
    }
    
    private void simplify() {
        int startNum;
        if (numerator < denominator)
            startNum = numerator;
        else 
            startNum = denominator;
        for (int div = startNum; div >= 2; div --) {
            if (numerator % div == 0 && denominator % div == 0) {
                numerator = numerator / div;
                denominator = denominator / div;
                break;
            }
        } 
        
        
    }
    
    //method to compare instances of Fraction
    public boolean isEqual(Fraction fNum) {
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
