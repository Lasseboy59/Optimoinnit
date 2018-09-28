package hackertest;

// https://stackoverflow.com/questions/692569/how-can-i-count-the-time-it-takes-a-function-to-complete-in-java
// http://www.techiedelight.com/split-list-two-sublists-java/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Solution_1d {

    static String findNumber(List<Integer> arr, int k) throws InterruptedException {

        System.out.println("Last item in the list " + k + ", the item to be searched: " + arr.get(arr.size() - 1));
        System.out.println("\nFirst item in the list, the count of items in the list: " + arr.get(0));
        System.out.println("listan koko ennen poistoja: " + arr.size());
        int toSearch = arr.get(arr.size() - 1);
        int countOfNumbers = arr.get(0);

        System.out.println("Listan koko: " + arr.size());
        arr.remove(arr.get(0));
        arr.remove(arr.size() - 1);

        System.out.println("Listan koko: " + arr.size());
//        Collections.sort(arr);

        if (arr.contains(k)) {
            return "YES";
        }
        return "NO";

//        System.out.println("--- sublist --");
//        List<Integer> head = arr.subList(0, countOfNumbers / 2);
//        List<Integer> tail = arr.subList(countOfNumbers / 2 + 1, countOfNumbers);

//        System.out.println(head);
//        System.out.println(tail);

//        TimeUnit.SECONDS.sleep(2);
//        System.out.println("*************** SLEEP *******************");

//        for (Integer num : tail) {
//            System.out.println("<- " + num);
//        }
//        if (head.contains(k) || (tail.contains(k))) {
//            return "YES";
//        }
//        return "NO";

//        if (head.contains(k)) {
//            return "YES";
//        } else if (tail.contains(k)) {
//            return "YES";
//        } else {
//            return "NO";
//        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {

        List<Integer> arr = new ArrayList<>();
//        long timeLapseBegin = System.nanoTime();

        arr = readFile();

//        timeLapseBegin = System.nanoTime() - timeLapseBegin;
//        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
//        System.out.println("-------- LUKU -------");
        long timeLapse = System.nanoTime();

        String ret = findNumber(arr, 20973);

        System.out.println("-------- HAKU -------");
        timeLapse = System.nanoTime() - timeLapse;
        System.out.println("secs: " + (double) timeLapse / 1000000000);
        System.out.println("");

        System.out.println("-> " + ret);

    }

    private static List readFile() throws FileNotFoundException, IOException {
//        System.out.println("Luetaan tiedosto");
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
