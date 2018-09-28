package hackertest;

// https://www.quora.com/How-do-I-store-an-arraylist-to-a-text-file-in-Java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WriteListArrayIntoFileAndReadListArray {

    static List<Integer> generateRandomArray(int n) {
        System.out.println("creating a random list with size of: " + n / (1000000));
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(100000);
            list.add(number);
        }

        return list;
    }

    private static void writeToFile() {
        final String FNAME = "c:\\temp\\text_in.txt";
        List<Integer> arr = new ArrayList<>();
//                                 123456789
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

    private static void readFile() throws FileNotFoundException, IOException {
        // Create a BufferedReader from a FileReader.
        BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\text_in_small.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Loop over lines in the file and print them.
        while (true) {
            String line = reader.readLine();
            System.out.println(line);
            if (line == null) {
                break;
            }
//            System.out.println(line);
            int number = Integer.parseInt(line);
            list.add(number);

        }
//        for (Integer num : list) {
//            System.out.println(" <- " + num);
//        }

        System.out.println("size: " + list.size());
        System.out.println("----");
        if (list.contains(81716)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt");
        }
        // Close the BufferedReader.
        reader.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        long timeLapseBegin = System.nanoTime();
        writeToFile();

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- LUKU -------");
        readFile();

    }
}
