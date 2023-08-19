/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class NotActivatedException extends Exception {
    public NotActivatedException(String errMsg) { //defining a constructor
       super(errMsg);  
    }
    
    public NotActivatedException(String errMsg, Throwable err) { // standard combination of error blocks together
       super(errMsg, err);  
    }
}
