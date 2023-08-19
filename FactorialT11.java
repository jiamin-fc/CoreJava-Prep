/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class FactorialT11 {
    public static void main(String[] args) {
        System.out.println(factorial(1)); //1 
        System.out.println(factorial(2)); //2
        System.out.println(factorial(3)); //6
        System.out.println(factorial(4)); //24
    }
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }   
}
