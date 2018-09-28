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

public class WriteArrayIntoFileAndReadArray_notReadingYet {

    static int[] generateRandomArray(int n) {
        System.out.println("creating a random list with size of: " + (10));
//        ArrayList<Integer> list = new ArrayList<Integer>(n);
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(100000);
            arr[i] = number;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }

    private static void writeToFile() {
        final String FNAME = "c:\\temp\\swap_array_in.txt";
        List<Integer> arr = new ArrayList<>();
        int[] arr2 = new int[100000];
//                                
//        arr = generateRandomArray(100000);
        arr2 = generateRandomArray(10);

        try (BufferedWriter bw
                = new BufferedWriter(new FileWriter(FNAME))) {
            for (Integer line : arr2) {
                bw.write(line + "\n");
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() throws FileNotFoundException, IOException {
        // Create a BufferedReader from a FileReader.
        BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\swap_array_in.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Loop over lines in the file and print them.
        while (true) {
            String line = reader.readLine();
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

        reader.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        writeToFile();
//        readFile();
        long timeLapseBegin = System.nanoTime();
//                           123456789
//        generateRandomArray(10000000);
        generateRandomArray(10);

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- LUKU -------");

    }
}
