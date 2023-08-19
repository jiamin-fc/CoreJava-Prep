/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */

public class L5Rectangle {
    private double length, width; 
    
    public void setDim(double rLength, double rWidth) {
        length = rLength;
        width = rWidth;
    }
    
    public String toString() {
        return "Rectangle: " + length + " x " + width;
    }
    //adding constructor, constructor has no type, when you define a constructor, 
    //the computer wont generate one for you, if the otherwise, the computer generates a constructor for you
                                        //public L5Rectangle() {}
    
    
    public L5Rectangle(double rLength, double rWidth) {
        length = rLength;
        width = rWidth;
        
    }
    public L5Rectangle() {
        length = 1;
        width = 1;
    }
    public boolean equals(L5Rectangle rect) {
        return (length == rect.length && width == rect.width); // comparing with instance of the rectangle class
        
        
    }
    public boolean equals(double rLength, double rWidth) { // comparing the dimensions of a number
        return (length == rLength && width == rWidth); //why cant u add the parameters in instead? so just the instance and GET method?
        //return (getArea() == rLength * rWidth);
    }
    //faster way of getting an area using GET Method
    public double getArea() {
        return(length * width);
    }
    //instance of GET Method
    public static double getArea(double rLength, double rWidth) {
        return rLength * rWidth;
    }
    
    // for internal testing only - not for assignment
    public static void main(String[] anythingrlly) {
        L5Rectangle r1 = new L5Rectangle();
        System.out.println(r1);
        r1.setDim(20, 10);
        System.out.println(r1);
    
        // how to create an instance
        L5Rectangle r2 = new L5Rectangle(20, 5);
        System.out.println(r2);   
    
        //comparing instances
        System.out.println(r1.equals(r2));
        
        //equal to an integer or width/height of a rectangle
        
}   
}

