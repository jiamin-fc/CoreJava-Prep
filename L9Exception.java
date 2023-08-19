/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */

// these are just a series of catching errors and handling errors

import java.util.Scanner;
import java.util.InputMismatchException;


public class L9Exception {
    public static void main(String[] anything) {
        example2();
//        example1();  
    }
    
    public static void example1() {
        Scanner kBoard = new Scanner(System.in);
        try{
            System.out.println("Array Size");
            int size = kBoard.nextInt();
            int[] sample = new int[size];
            sample [5] = 100;
            System.out.println(sample[5]);
        }
        catch(NegativeArraySizeException err) {
            System.out.println(err) // catch block
//        }
//        catch(InputMismatchException err) {
//            System.out.println(err) // catch block
                    
//        } this is combining two error catch blocks
//        catch(InputMismatchException | NegativeArraySizeException err) {
//            System.out.println(err) // catch block
                 
                    
            System.out.println("End of System One");

    }
    
    public static void example2() {
        Scanner kBoard = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while (true) {
            try{
                System.out.println("Enter a number ");
                int num = kBoard.nextInt();
                if ( num < 0)
                    break;
                total += num;
                count++;
                
            }
            catch(InputMismatchException err) {
                System.out.println("Please enter numeric values");
                kBoard.nextLine();
            }
        
        }
        System.out.println("Total is " + total);
        
    }
    
}


