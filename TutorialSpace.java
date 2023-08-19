
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


public class TutorialSpace {
    private int slots;
    private String code;
    private boolean activated;
    
    public TutorialSpace(String classCode, int classSize) {
        code = classCode;
        slots = classSize;
    }
    public int slotsRemaining() {
        return slots;
    }
    public void activate() {
        if (activated) {
            throw new RuntimeException(code + " is already activated"); //JVM throwing exception unless if it is not activated
        }
        activated = true; //activated(true);
    }
    
        public void reserveSlot() throws EmptyException, NotActivatedException {
        if (activated == false)
            throw new NotActivatedException(code + " is not activated");
        if (slots == 0)
            throw new EmptyException(code + " is full");
        slots--;
    }
}

//there is an error as it is not declared and does not have a throw clause

//    public void reserveSlot() {
//        if (activated == false)
//            throw new NotActivatedException(code + " is not activated");
//    }
//}
    
//    public void reserveSlot() {
//        if (activated == false)
//            try {
//                throw new NotActivatedException(code + " is not activated");
//        } catch (NotActivatedException ex) {
//            Logger.getLogger(TutorialSpace.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}




