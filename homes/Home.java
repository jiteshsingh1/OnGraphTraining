package homes;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Home {

    public static void main(String[] args) {

        String path = "C:/Users/AMD/Desktop/interview/practice/java_oscar_problem/homes/test2homes.csv";
        String line = "";

        ArrayList<Integer> profitList = new ArrayList<Integer>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");

                Integer list = Integer.parseInt(values[1]);
                Integer sell = Integer.parseInt(values[0]);
                Integer taxes = Integer.parseInt(values[8]);

                int proift = ((list - sell) * 1000) - taxes;
                profitList.add(proift);

            }
            Collections.sort(profitList);
            System.out.println(profitList);

            System.out.println(profitList.get(profitList.size() - 1));// most profit
            System.out.println(profitList.get(profitList.size() - 2));// second most profit
            System.out.println(profitList.get(profitList.size() - 3));// third one

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
