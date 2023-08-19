/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class L11CountA {
    public static void main(String[] args) {
        System.out.println(countA("123abc")); // 1
        System.out.println(countA("AA3abc")); // 3
    }
    public static int countA(String s) {
        if (s.length() == 0)
            return 0;
        else {
            char firstChar = s.charAt(0);
            String theRest = s.substring(1);
            if (firstChar == 'a' || firstChar == 'A');
                return 1 + countA(theRest);
            else 
                return 0 + countA(theRest);
            
        }
    } 
}
        
