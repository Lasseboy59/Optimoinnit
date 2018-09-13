package omatohjelmat;

// https://stackoverflow.com/questions/692569/how-can-i-count-the-time-it-takes-a-function-to-complete-in-java
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static omatohjelmat.RandomNumberList.generateRandomArray;

public class Solution_1b {

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

    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();

        arr = generateRandomArray(100000000);

        long tm2 = System.nanoTime();

        String ret = findNumber(arr, 5);

        tm2 = System.nanoTime() - tm2;
        System.out.println("secs: " + (double) tm2 / 1000000000);
        System.out.println("");

        System.out.println("-> " + ret);

    }

}
