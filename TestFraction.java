/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */

import java.util.Scanner;

public class TestFraction {
    public static void main(String[] abc) {
        Scanner kBoard = new Scanner(System.in);
        Fraction fTotal = new Fraction();
        fTotal.setNumerator(0);
        fTotal.setDenominator(1);
        
        Fraction fNumber = new Fraction();
        while (true) {
            System.out.println("Numerator? ");
            int numerator = kBoard.nextInt();
            if (numerator == 0)
                break;
            System.out.println("Denominator? ");
            int denominator = kBoard.nextInt();
            fNumber.setNumerator(numerator);
            fNumber.setDenominator(denominator);
            // Add the instances
            //fTotal.add(fNumber); this creates a new instance which is the output
            
            fTotal = fTotal.add(fNumber); // always refer to latest sum
            //print the running total
            System.out.println(fTotal);
            
        }
        System.out.println(fTotal);
        
    }
    
}


 /*
        Fraction f1 = new Fraction();
        f1.setNumerator(2); //for frac1
        f1.setDenominator(10);
        Fraction f2 = new Fraction(); // for frac2
        f2.setNumerator(4);
        f2.setDenominator(20);
        
        Fraction fSum = f1.add(f2);
        System.out.println(f1);
        System.out.println(f2); //is it possible to calculate both variables together?
        System.out.println(fSum);
        */