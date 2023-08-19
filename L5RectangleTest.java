/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author smoo
 */
public class L5RectangleTest {
    public static void main(String[] anyth) {
        // L5Rectangle[] rects; //an array of rectangles, as a reference
        // L5Rectangle r1; not an instance but a reference to point so it is a null
        // L5Rectangle r2 = new L5Rectangle(10,5) it is an instance or technically a ref as an instance but it points to 10,5 value
        L5Rectangle[] rects = new L5Rectangle[5]; // diff concept
        getSample(rects);
        
        for (int i = 0; i < rects.length; i++) {
            System.out.println(rects[i]);
        }
        
        //print the largest
        double largest = rects[0].getArea();
        for (int curr = 1; curr < rects.length; curr++) {
            if (rects[curr].getArea() > largest)
                largest = rects[curr].getArea();
        }
        
        System.out.println("Largest area is " + largest);
        // check instances of the same
        boolean duplicate = false;
        for (int curr = 0; curr < rects.length - 1; curr++) {
            L5Rectangle currRect = rects[curr];
            for (int next = curr +1; next < rects.length; next++) {
                L5Rectangle nextRect = rects[next];
                if (currRect.equals(nextRect)) {
                    if (currRect.equals(nextRect)) {
                        duplicate = true;
                        break;
                    } 
                }
            } 
        } 
    }
    public static void getSample(L5Rectangle[] rects) {
        rects[0] = new L5Rectangle(50, 20); //0 meaning first one
        rects[1] = new L5Rectangle(40, 30);
        rects[2] = new L5Rectangle(30, 30); 
        rects[3] = new L5Rectangle(20, 60); 
        rects[4] = new L5Rectangle(80, 50); 
               
    }  
}
