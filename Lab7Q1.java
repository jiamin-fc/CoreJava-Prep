import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
        
        
public class Lab7Q1 {
    public static void main(String[] args) {
        String infileName = "Lab7Data.txt"; 
        String outfileName = "lab7output.txt";
        Scanner reader = null;
        PrintWriter writer = null;
        try {
            reader = new Scanner(new File(infileName));
            writer = new PrintWriter(outfileName);
            int lineNo = 1;
            while (reader.hasNext()) {
                String oneLine = reader.nextLine();
                System.out.println(lineNo + "" + oneLine);
                writer.println(lineNo + "" + oneLine);
                lineNo++;
            }
            
            
        } catch (FileNotFoundException err) {
            System.out.println(err);
        } finally {
            if (reader != null)
                reader.close();
            if (writer != null)
                writer.close();
        }
        System.out.println("End of main method");
    }
    
}
