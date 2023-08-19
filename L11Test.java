import java.util.*; //arraylist + scanner lib
import java.io.*; // input and output streams for files


public class L11Test {
    public static void main(String[] args) {
        ArrayList<L11Trainee> trainees = new ArrayList<>();
        getTrainee(trainees);
        getResults(trainees);
        for (L11Trainee t : trainees) {
            System.out.println(t + " " + t.getResult());
        }
    }
    public static void getResults(ArrayList<L11Trainee> trainees) {
        File datafile = new File("L11database.txt");
        try (Scanner reader = new Scanner(datafile)) {
            while (reader.hasNext()) {
                String oneLine = reader.nextLine();
                String[] values = oneLine.split(",jii");
                // look for matching trainees
                for (L11Trainee t : trainees) {
                    if (t.getId().equalsIgnoreCase(values[0]))
                        t.setScores(Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]));
                }
            }
            
        } catch (IOException err) {
            System.out.println(err);
        }
    }
    
    public static void getTrainee(ArrayList<L11Trainee> trainees) {
        trainees.add(new L11Trainee("T1", "Ben"));
        trainees.add(new L11Trainee("T2", "Zorro"));
        trainees.add(new L11Trainee("T3", "Superman"));
        trainees.add(new L11Trainee("T4", "Wick"));
        trainees.add(new L11Trainee("T5", "John"));
        trainees.add(new L11Trainee("T6", "Abe"));
        trainees.add(new L11Trainee("T9", "Zero"));
    }
    
}
