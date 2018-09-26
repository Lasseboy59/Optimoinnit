package hackertest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class H_HourglassSum2 {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

//        printThe2Array(arr);
        System.out.println("");
        int i = 0, j = 0, counter = 0;
        int sumOfGlass = -100;
        int biggestsumOfGlass = -100;
        List<Integer> myList = new ArrayList<Integer>();

        for (int rivi = 0; rivi < arr.length; rivi++) {
            sumOfGlass = 0;
            for (int sarake = 0; sarake < arr.length; sarake++, counter++) {
                sumOfGlass = 0;
                System.out.println("ruutu: " + (counter + 1));

                for (i = rivi; i < 3 + rivi && i < arr.length; i++) {
                    for (j = sarake; j < 3 + sarake && j < arr.length; j++) {
                        System.out.print(arr[i][j] + " ");
                        int num = arr[i][j];
                        myList.add(num);
                    }
                    System.out.println(""); // Let this be here!!
                }

                if (sarake == 3) {

                    System.out.println("********************");
                    System.out.println("array: " + myList);

                    for (Integer num : myList) {
                        if (num == 0) {
                            System.out.print(" + " + num);
                        } else {
                            System.out.print("  " + num);
                        }
                    }

                    System.out.println("\n*******************");
                    System.out.println("");

                    for (Integer num : myList) {
                        sumOfGlass += num;
                    }
                    System.out.println("ind(3) + ind(5): " + myList.get(3) + " + " + myList.get(5) + " = " + (myList.get(3) + myList.get(5)));
                    System.out.println("SUMMA: " + sumOfGlass + " - " + ((myList.get(3) + myList.get(5))));

                    sumOfGlass = sumOfGlass - (myList.get(3) + myList.get(5));
                    System.out.println("SUMMA: " + sumOfGlass);
                    if (sumOfGlass > biggestsumOfGlass) {
                        biggestsumOfGlass = sumOfGlass;
                        sumOfGlass = 0;
                    }
                    myList.clear();

                    counter++;
                    System.out.println("sarake == 3 -- break");
                    sumOfGlass = 0;
                    break;

                }

                System.out.println("-------------");
                System.out.println("array: " + myList);
                for (Integer num : myList) {
                    if (num == 0) {
                        System.out.print(" + " + num);
                    } else {
                        System.out.print("  " + num);
                    }
                }
                System.out.println("");

                for (Integer num : myList) {
                    sumOfGlass += num;
                }
                System.out.println("ind(3) + ind(5): " + myList.get(3) + " + " + myList.get(5) + " = " + (myList.get(3) + myList.get(5)));
                System.out.println("SUMMA: " + sumOfGlass + " - " + ((myList.get(3) + myList.get(5))));
                sumOfGlass = sumOfGlass - (myList.get(3) + myList.get(5));
                System.out.println("SUMMA: " + sumOfGlass);
                if (sumOfGlass > biggestsumOfGlass) {
                    biggestsumOfGlass = sumOfGlass;
                    sumOfGlass = 0;
                }
                sumOfGlass = 0;
                myList.clear();
            }
            System.out.println("-------------");
            myList.clear();

            if (rivi == 3) {

                counter++;
                System.out.println("rivi == 3 -- break");
                sumOfGlass = 0;
                break;
            }
        }

        System.out.println("suurin: " + biggestsumOfGlass);

        return biggestsumOfGlass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final String FNAME = "c:\\temp\\hourglassSum.log";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
//        Random r = new Random();
//        int randint = Math.abs(r.nextInt()) % 11;
//
//        int[][] arr = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0},
//        {0, 9, 2, -4, -4, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, -1, -2, -4, 0}};
//
//        int[][] arr2 = {{-9, -9, -9, 1, 1, 1}, {0, -9, 0, 4, 3, 2}, {-9, -9, -9, 1, 2, 3},
//        {0, 0, 8, 6, 6, 0}, {0, 0, 0, -2, 0, 0}, {0, 0, 1, 2, 4, 0}};

//        int[][] arr = new int[6][6];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//
//                arr[i][j] = randint = Math.abs(r.nextInt()) % 11;;
////                System.out.print(arr[i][j] + " ");
//            }
////            System.out.println("");
//        }
        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    private static void printThe2Array(int[][] arr) {
        System.out.println("****************");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("****************");
    }
}
