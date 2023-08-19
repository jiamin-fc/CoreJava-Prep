/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class Point {
    private double x; // private variable
    private double y;
    
    //making ref to x and y for method to compare instances of Point
    //pt is called p2 here
    public boolean isEqual(Point pt) {
        if (x == pt.x && y == pt.y)
            return true;
        else 
            return false; 
    //p1.isEqual(p2)
    //p2.isEqual(p1)
    }
    
    // GET method, accessing the values using GET method 
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    // Set methods
    public void setX(double xValue) {
        x = xValue;
    }
    public void setY(double yValue) {
        y = yValue;
    }
    //toString is a method name, instance of a "String"
    // it inputs a string
    public String toString() {
        return "(" + x + ", " + y + ")";
      
    }
    
    
}
