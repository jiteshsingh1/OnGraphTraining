import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class oscarCSV {

    public static void main(String[] args) {

        String path = "C:/Users/AMD/Desktop/interview/practice/java_oscar_problem/test.csv";
        String line = "";
        Oscar youngest;
        Oscar oldest;
        ArrayList<Oscar> ageList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                ageList.add(new Oscar(
                        Integer.parseInt(values[0]),
                        Integer.parseInt(values[2]),
                        values[6],
                        Integer.parseInt(values[4]),
                        values[8]));

            }
            Collections.sort(ageList, new OscarComp());

            youngest = ageList.get(0);
            oldest = ageList.get(ageList.size() - 1);
            Iterator it = ageList.iterator();

            while (it.hasNext()) {
                Oscar o1 = (Oscar) it.next();
                if (youngest.age == o1.age) {
                    System.out.println("Yougest: " + o1);
                } else if (oldest.age == o1.age) {
                    System.out.println("Oldest: " + o1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
