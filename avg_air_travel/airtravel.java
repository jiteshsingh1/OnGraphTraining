import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class airtravel {
    public static void main(String[] args) {

        String path = "C:/Users/AMD/Desktop/interview/practice/avg_air_travel/testair.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Integer totalAt1958 = 0;
            Integer totalAt1959 = 0;
            Integer totalAt1960 = 0;
            Integer rowCount = 0;

            while ((line = br.readLine()) != null) {
                rowCount++;
                String[] values = line.split(",");
                totalAt1958 = totalAt1958 + Integer.parseInt(values[1]);
                totalAt1959 = totalAt1959 + Integer.parseInt(values[2]);
                totalAt1960 = totalAt1960 + Integer.parseInt(values[3]);
            }
            System.out.println("Average for 1958: " + totalAt1958 / rowCount);
            System.out.println("Average for 1959: " + totalAt1959 / rowCount);
            System.out.println("Average for 1960: " + totalAt1960 / rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
