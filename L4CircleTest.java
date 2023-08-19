/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** instance, static, local variables
 *
 * @author smoo
 */
public class L4CircleTest {
    public static void main(String[] anythingrlly) {
        L4Circle c1 = new L4Circle(); // defining a variable
        c1.setRadius(10); //setting the radius
        System.out.println(c1.getArea()); //getting the area
        
        //using static method to calculate
        //area without creating an instance
        
        double area = L4Circle.getArea(100);
        System.out.println(area);
        System.out.println(L4Circle.PI);
        
    }
    
}
