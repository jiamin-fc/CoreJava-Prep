/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class L11Recursion {
    public static void main(String[] args) {
        System.out.println(sum(1)); //1
        System.out.println(sum(2)); //3
        System.out.println(sum(3)); //6 
        System.out.println(sum(4)); //10
        
        
    }
    public static int sum(int n) {
        if (n == 1) // what about post and pre increment
            return 1;
        else {
            return (n + sum(n - 1));
        }
    }
}
