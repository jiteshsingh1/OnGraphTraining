import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cities {

    public static void citycount(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String city : list) {
            Integer j = map.get(city);
            if (j == null) {
                map.put(city, 1);
            } else {
                map.put(city, j + 1);
            }
        }

        for (Map.Entry<String, Integer> val : map.entrySet()) {
            System.out.println("State " + val.getKey() + " has " + val.getValue() + " cities");
        }
    }

    public static void main(String[] args) {

        String path = "C:/Users/AMD/Desktop/interview/practice/java_oscar_problem/cities/cities.csv";
        String line = "";
        ArrayList<String> citielist = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                citielist.add(values[9]);
                // System.out.println(values[9]);

            }
            citycount(citielist);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
