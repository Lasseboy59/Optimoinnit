package omatohjelmat;

// https://stackoverflow.com/questions/692569/how-can-i-count-the-time-it-takes-a-function-to-complete-in-java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static omatohjelmat.RandomNumberList.generateRandomArray;

public class Solution_1c {

    static String findNumber(List<Integer> arr, int k) {

        System.out.println("Last item in the list, the item to be searched: " + arr.get(arr.size() - 1));
        System.out.println("Searhed item according input params: " + k);
        System.out.println("First item in the list, the count of items in the list: " + arr.get(0));

        System.out.println("listan koko ennen poistoja: " + arr.size());
        int toSearch = arr.get(arr.size() - 1);
        int countOfNumbers = arr.get(0);
        arr.remove(arr.get(0));
        arr.remove(arr.size() - 1);

        System.out.println("listan koko: " + arr.size());

//        List<Integer> head = arr.subList(0, (Integer)(countOfNumbers / 2));
//        System.out.println(head);
        if (arr.contains(k)) {
            return "YES";
        }
        return "NO";

    }

    static List<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

//                123456789
        list.add(100000000);
//        list.add(10000000);
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(11);
            list.add(number);
        }

        list.add(5);

        return list;
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
//            System.out.println(line);
            int number = Integer.parseInt(line);
            list.add(number);

        }
//        for (Integer num : list) {
//            System.out.println(" <- " + num);
//        }
        System.out.println("----");
        if (list.contains(69816)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt");
        }
        // Close the BufferedReader.
        reader.close();
        return list;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();

//        arr = generateRandomArray(100000000);
        long timeLapseBegin = System.nanoTime();

        arr = readFile();

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- LUKU -------");

        long timeLapse = System.nanoTime();

        String ret = findNumber(arr, 5310);

        System.out.println("-------- HAKU -------");
        timeLapse = System.nanoTime() - timeLapse;
        System.out.println("secs: " + (double) timeLapse / 1000000000);
        System.out.println("");

        System.out.println("-> " + ret);

    }

}
