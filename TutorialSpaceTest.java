//
//import java.util.logging.Level;
//import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */


public class TutorialSpaceTest {
    public static void main(String[] anything) {
        TutorialSpace t1 = new TutorialSpace("ICT167 A", 3);
//        t1.activate();
        t1.activate();
        try{
            t1.reserveSlot();
            System.out.println(t1.slotsRemaining());
            t1.reserveSlot();
            System.out.println(t1.slotsRemaining());
            t1.reserveSlot();
            System.out.println(t1.slotsRemaining());
            t1.reserveSlot();
            System.out.println(t1.slotsRemaining());
        }
        catch (NotActivatedException | EmptyException err) {
            System.out.println(err);
        }
        
        System.out.println("End of System");
    }
}
// compiler will not brother if it is uncheck
// compiler if it is using the check, it will expect a try catch block for the throw exception




