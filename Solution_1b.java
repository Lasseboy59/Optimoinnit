package omatohjelmat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static omatohjelmat.RandomNumberList.generateRandomArray;

public class Solution_1b {

    static String findNumber(List<Integer> arr, int k) {

//        for (Integer luku : arr) {
//            System.out.println("" + luku);
//        }
        System.out.println("listan koko: " + arr.size());

        int montako = arr.get(0);
        double etsittava = arr.get(arr.get(0) + 1);
        System.out.println("etsittävä: " + etsittava);
        arr.remove(Integer.valueOf(montako));
//        arr.remove(Double.valueOf(etsittava));
//        System.out.println("-- " + arr.get(arr.size()));
//        arr.remove(arr.size());

        System.out.println("listan koko: " + arr.size());

        if (arr.contains(k)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    static List<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();
        list.add(10);
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(11);
            list.add(number);
        }
        list.add(5);
        return list;
    }

    static List<Integer> generateArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);

        list.add(1000);
        for (int i = 0; i < n; i++) {
            int number = i;
            list.add(number);
        }
        list.add(500);
        return list;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();
//        arr = generateRandomArray(10);
//        arr = generateArray(10000000);
        arr = generateArray(1000);

        String paluu = findNumber(arr, 500);
        System.out.println("-> " + paluu);

    }

}
