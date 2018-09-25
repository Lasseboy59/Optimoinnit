package hackertest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class H_Solution_2D_array {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int i = 0, j = 0, counter = 0;
        int sumOfGlass = -100;
        int biggestsumOfGlass = -100;
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> listOfSums = new ArrayList<Integer>();

        for (int rivi = 0; rivi < arr.length; rivi++) {
            sumOfGlass = 0;
            for (int sarake = 0; sarake < arr.length; sarake++, counter++) {
                sumOfGlass = 0;

                for (i = rivi; i < 3 + rivi && i < arr.length; i++) {
                    for (j = sarake; j < 3 + sarake && j < arr.length; j++) {
                        int num = arr[i][j];
                        myList.add(num);
                    }

                }

                if (sarake == 3) {

                    for (Integer num : myList) {
                        sumOfGlass += num;
                    }
                    sumOfGlass = sumOfGlass - (myList.get(3) + myList.get(5));

                    listOfSums.add(sumOfGlass);
                    sumOfGlass = 0;

                    myList.clear();
                    counter++;
                    sumOfGlass = 0;
                    break;

                }
                for (Integer num : myList) {
                    sumOfGlass += num;
                }

                sumOfGlass = sumOfGlass - (myList.get(3) + myList.get(5));
                listOfSums.add(sumOfGlass);
                sumOfGlass = 0;
                myList.clear();
            }

            myList.clear();

            if (rivi == 3) {
                counter++;
                sumOfGlass = 0;
                break;
            }
        }

        Collections.sort(listOfSums);
        biggestsumOfGlass = listOfSums.get(listOfSums.size() - 1);
        System.out.println(biggestsumOfGlass);
    }
}
