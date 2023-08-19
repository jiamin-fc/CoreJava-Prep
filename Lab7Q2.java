import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Lab7Q2 {
    public static void main(String[] argv) {
        Score[] records = new Score[10];
        getData(records);
        
        //Verify
        for (int i = 0; i < records.length; i++) {
            String mesg = records[i].getName() + "," +
                    records[i].getMark();
            System.out.println(mesg);
            writer.println(mesg);
        }
        saveData(records);
    }
    
    public static void getData(Score[] records) {
        Scanner reader = null;
        try {
            reader = new Scanner(new File("Score.txt"));
            int currIdx = 0;
            while (reader.hasNext()) {
                String oneLine = reader.nextLine();
                String[] data = oneLine.split(" ");
                Score temp = new Score(data[0], Integer.parseInt(data[1]));
                
                records[currIdx] = temp;
                currIdx++;
            }
        } catch (FileNotFoundException err) {
            System.out.println(err);
        } finally {
            if (reader != null);
            reader.close();
        }
        
    }
    public static void saveData(Score[] records) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("scores_out.csv");
        } catch (FileNotFoundException err) {
            System.out.println(err);
            
        } finally {
            if (writer != null)
                writer.close();
        }
    }


