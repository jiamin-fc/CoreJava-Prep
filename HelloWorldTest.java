/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
import java.util.Scanner;

public class HelloWorldTest {
    public static void main(String[] anythingreally) {
        Scanner kBoard = new Scanner(System.in);
        HelloWorld f1 = new HelloWorld();
        while (true) {
            System.out.println("enter numerator: ");
            int nuValue = kBoard.nextInt();
            if (nuValue < 0) {
                break;
            }
            System.out.println("enter denominator");
            int deValue = kBoard.nextInt();
            //HelloWorld f1 = new HelloWorld();
            //f1.setNumerator(10);
            //f1.setDenominator(-23);
            //System.out.println(f1);
         
            f1.setNumerator(nuValue);
            f1.setDenominator(deValue);
            System.out.println(f1);
        }
        
        //to test the isEqual method
        HelloWorld f2 = new HelloWorld();
        f2.setNumerator(4);
        f2.setDenominator(5);
        HelloWorld f3 = new HelloWord();
        f3.setNumerator(4);
        f3.setDenominator(10);
        System.out.println(f2.isEqual(f3)); 
    }
}


