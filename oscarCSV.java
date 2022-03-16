import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class oscarCSV {
    public boolean isbig() {
        return false;
    }

    public static void main(String[] args) {

        String path = "C:/Users/AMD/Desktop/interview/practice/java_oscar_problem/test.csv";
        String line = "";

        Integer youngage;
        Integer oldage;

        ArrayList<Integer> ageList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedReader cr = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                String[] arr = line.split(",");
                ageList.add(Integer.parseInt(arr[4]));

            }
            Collections.sort(ageList);

            youngage = ageList.get(0);

            oldage = ageList.get(88);

            while ((line = cr.readLine()) != null) {
                String[] arr = line.split(",");
                if (Integer.parseInt(arr[4]) == oldage) {
                    System.out.println("oldest: " + line);
                } else if (Integer.parseInt(arr[4]) == youngage) {
                    System.out.println("youngest:" + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
