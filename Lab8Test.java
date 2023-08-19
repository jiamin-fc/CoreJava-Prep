/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class Lab8Test {
    public static void main(String[] argv) { // main method
        Lab8Baby[] babies = new Lab8Baby[5];
        
        // Hard code some instances
        babies[0] = new Lab8Patient("Alice", 2, 101);
        babies[1] = new Lab8Baby("Larry", 3);
        babies[2] = new Lab8Playgroup("John", 1);
        babies[3] = new Lab8Baby("June", 3);
        babies[4] = new Lab8Patient("April", 4, 201);
        // Process only instances of Lab8Patient 
        
        for (int i = 0; i < babies.length; i++) {
            if (babies[i] instanceof Lab8Patient) {
                System.out.println(babies[i]);
                System.out.println(babies[i].babySound());
                // Cast the reference to derived class
                Lab8Patient temp = (Lab8Patient)babies[i];
                System.out.println(babies[i].getId());
                
            }
        }
        //Only instances of Lab8Playgroup
        for (int i = 0; i < babies.length; i++) {
            if (babies[i] instanceof Lab8Playgroup) {
                System.out.println(babies[i]);
                System.out.println(babies[i].babySound());
                
            }
        }
    }
}
