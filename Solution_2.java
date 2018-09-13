package omatohjelmat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Solution_2 {

    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(List<Integer> arr, int l, int r) {

        Collections.sort(arr);

        for (Integer number : arr) {
            System.out.println(number);
        }

        return arr;
    }

    static List<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

//        for (int i = 0; i < n; i++) {
//            
//            int number = random.nextInt(10)+1;
//            list.add(number);
//        }
        list.add(5);
        list.add(2);

        return list;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

//        Listan pituus
        arr = generateRandomArray(10);

        System.out.println("listan koko: " + arr.size());

        arr = oddNumbers(arr, 2, 5);

        System.out.println("-------------");
        for (Integer luku : arr) {
            System.out.println(luku);
        }
    }

}
