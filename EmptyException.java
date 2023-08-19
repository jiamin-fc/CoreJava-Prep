/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class EmptyException extends Exception {
    public EmptyException(String errMsg) { //defining a constructor
       super(errMsg);  
    }
    
    public EmptyException(String errMsg, Throwable err) { // standard combination of error blocks together
       super(errMsg, err);  
    }
}
