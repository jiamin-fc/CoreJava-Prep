/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class L4Circle {
    public static final double PI = 3.1415; // define PI using a static final method
  //  public static final double int PI = 3.1415; // (because static is only for one object, fetching from one method, no matter how many objects are created)
  //  public static final double PI = 3.1415; // final meaning the value will never change in the variable
  // public double int PI = 3.1415; //instances (because it is an instance so there will be one copy)
    
    private double radius;
    
    public void setRadius(double rValue) {
        if (rValue > 0)
            radius = rValue; //to count the value of the radius
        
    }
    
    public double getRadius() { //get.Method
        return radius;
    }
    
    public double getArea() {
        return PI * radius * radius;
        
    }
    
    public static double getArea(double rValue) { //double rValue is called a parameter
        return PI * rValue * rValue;
        
        
    }
    
}
