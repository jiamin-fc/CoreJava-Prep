/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class PointTest {
    public static void main(String[] anything) {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(100);
        System.out.println(p1);
        System.out.println(p1.toString());
        
        //another instance
        Point p2 = new Point();
        p2.setX(10);
        p2.setY(100);
        System.out.println(p2);
        
        //comparing 2 instances of Point
        System.out.println(p1 == p2);
        
        //Correct way of comparing
        //compareTo() is meant for strings and integers
        System.out.println(p1.isEqual(p2));
        System.out.println(p2.isEqual(p1));
        
        //calling method with Point instance
        change(p2); //the JVM will look for the method of change
        System.out.println(p2);
        System.out.println(p1.isEqual(p2));
    }
    
    public static void change(Point pt) {
        double newX = pt.getX() * 2; //whatever method will effect the instance
        double newY = pt.getY() * 2;
        
        pt.setX(newX);
        pt.setY(newY);
    }
    
    
}
