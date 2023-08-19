/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */

import java.util.Scanner;

public class Test2Quiz {
    
    public static void printLargestSmallest() {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter 3 numbers?");
        double num1 = kBoard.nextDouble();
        double num2 = kBoard.nextDouble();
        double num3 = kBoard.nextDouble();
        
        if (num1 > num2 && num1 > num3)
            System.out.println("Largest:" + num1);
        
        else if (num2 > num3)
            System.out.println("Largest:" + num2);
        else
            System.out.println("Largest:" + num3);
        
        // smallest number calculaton
        if (num1 < num2 && num1 < num3)
            System.out.println("Smallest:" + num1);
        
        else if (num2 < num3)
            System.out.println("Smallest:" + num2);
        else
            System.out.println("Smallest:" + num3);
    }
    
    public static void printInfo() {
        System.out.println("ID: 12314313");
        System.out.println("Name: Someone who u use to know");
        System.out.println("Classname ICT167A");
    }
    public static void print5PerRow() {
        Scanner kBoard = new Scanner(System.in);
        System.out.println("Enter 2 Integers");
        int startNum = kBoard.nextInt();
        int endNum = kBoard.nextInt();
        
        for (int i = startNum; i <= endNum; i++ ) {
            System.out.println(i + " ");
        }  
    }
    
    public static void main(String[] whyisthislikethat) {
        Scanner kBoard = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an option");
            String userInput = kBoard.nextLine();
            
            char option = userInput.charAt(0);
            if (option == 'q') {
                break;
            }
            else if (option == 'a') {
                printInfo();
            }
            else if (option == 'b')
                printLargestSmallest();
            
            else if (option == 'c') {
                print5PerRow();
            }
            // what about the other alphabets?
            else {
                System.out.println("Not Ready");
            }
        
        
        }
    }
}
    
    

