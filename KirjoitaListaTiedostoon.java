

package omatohjelmat;

// https://www.quora.com/How-do-I-store-an-arraylist-to-a-text-file-in-Java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KirjoitaListaTiedostoon {

    static List<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

//                123456789
        list.add(100000000);
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(11);
            list.add(number);
        }

        list.add(5);

        return list;
    }

    public static void main(String[] args) {
        final String FNAME = "c:\\temp\\test.txt";
        List<Integer> arr = new ArrayList<>();


        arr = generateRandomArray(1000);

        try (BufferedWriter bw
                = new BufferedWriter(new FileWriter(FNAME))) {
            for (Integer line : arr) {
                bw.write(line + "\n");
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
