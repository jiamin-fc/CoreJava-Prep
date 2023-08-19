import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] argv) {
        ArrayList<Lab10Student> students = new ArrayList<>();
        
        // Checking only
        System.out.println(students.size());
        readStudents(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        
        // Print Lab10ExtStudents Only
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) instanceof Lab10ExtStudent) {
                System.out.println(students.get(i));
            }
        }
        
        // Print instances of "Group 2"
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) instanceof Lab10ExtStudent) {
                Lab10ExtStudent temp = (Lab10ExtStudent) students.get(i);
                
                if (temp.getGroup().equalsIgnoreCase("Group 2")) {
                    System.out.println(temp);
                }
            }
        }
    }
    
    public static void readStudents(ArrayList<Lab10Student> students) {
        String fileName = "Lab10Data.txt";
        try (Scanner reader = new Scanner(new File(fileName))) {
            
            while (reader.hasNext()) {
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",");
                if (values.length == 2) {
                    Lab10Student temp = new Lab10Student(values[0], values[1]);
                    students.add(temp);
                } else if (values.length == 3) {
                    Lab10ExtStudent temp = new Lab10ExtStudent(values[0], values[1], values[2]);
                    students.add(temp);
                }
            }
            
        } catch (FileNotFoundException err) {
            System.out.println(err);
        }
    }
}

