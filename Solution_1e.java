package hackertest;

// https://stackoverflow.com/questions/692569/how-can-i-count-the-time-it-takes-a-function-to-complete-in-java
// http://www.techiedelight.com/split-list-two-sublists-java/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Solution_1e {

    static String findNumber(List<Integer> arr, int k) throws InterruptedException {

        System.out.println("Last item in the list " + k + ", the item to be searched: " + arr.get(arr.size() - 1));
        System.out.println("\nFirst item in the list, the count of items in the list: " + arr.get(0));
        System.out.println("listan koko ennen poistoja: " + arr.size());

        System.out.println("Listan koko: " + arr.size());
        arr.remove(arr.get(0));
        arr.remove(arr.size() - 1);

        System.out.println("Listan koko: " + arr.size());

        if (arr.contains(k)) {
            return "YES";
        }
        return "NO";

    }

    public static void main(String[] args) throws IOException, InterruptedException {

        List<Integer> arr = new ArrayList<>();

        arr = readFile();

        long timeLapse = System.nanoTime();

        System.out.println("-------- Hyppy aliohjelmaan -------");
        String ret = findNumber(arr, -1);

        System.out.println("-------- Haku tehty  -------");
        timeLapse = System.nanoTime() - timeLapse;
        System.out.println("secs: " + (double) timeLapse / 1000000000);
        System.out.println("");

        System.out.println("-> " + ret);

    }

    private static List readFile() throws FileNotFoundException, IOException {
        System.out.println("Luetaan tiedosto");
        // Create a BufferedReader from a FileReader.
        BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\text_in.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Loop over lines in the file and print them.
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            int number = Integer.parseInt(line);
            list.add(number);

        }

        // Close the BufferedReader.
        reader.close();
        return list;
    }
}
