/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.io.*;
import java.util.*;

public class H_HourglassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        printThe2Array(arr);

        System.out.println("");
        int i = 0, j = 0;
        
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length; l++) {
                

                for (i = k; i < 3 + k && i < arr.length; i++) {
                    for (j = k; j < 3 + k && j < arr.length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println("");
                }

                System.out.println("");
            }
        }

        return 5;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final String FNAME = "c:\\temp\\hourglassSum.log";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
        Random r = new Random();
        int randint = Math.abs(r.nextInt()) % 11;

        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = randint = Math.abs(r.nextInt()) % 11;;
//                System.out.print(arr[i][j] + " ");
            }
//            System.out.println("");
        }

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
