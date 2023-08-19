

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class L11Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("abc123")); // reverse of letters/integers //1 character at one go
        
    }
    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else {
            char firstChar = s.charAt(0);
            String theRest = s.substring(1);
            return reverse(theRest) + firstChar;
        }
    }
}
