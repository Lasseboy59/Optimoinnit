package hackertest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

//        System.out.println("arrayn pituus: " + c.length);
//        System.out.println("-------------------------");
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(i + "^" + c[i] + " - ");
//        }
//        System.out.println("\n-------------------------");

        int jump = 0;
        for (int i = 0; i < c.length - 1; i++) {
//            System.out.println("i= " + i);
            if (c[i] == 0) {
                
                if((c[i + 1] == 0) && ((i+1) == c.length -1  )) {
                    jump++;
                    break;
                }
                else if ((c[i + 2] == 0) && (i < c.length)) {
//                    System.out.println("DECISION when i = " + i + " A");
//                    System.out.println("[" + i + "] = " + c[i] + " && [" + (i + 2) + "] = " + c[i + 2]);

//                    System.out.println("From [" + i + "] jump from to c[" + (i + 2) + "]");
                    jump++;
                    i++;

                } else {
//                    System.out.println("DECISION when i = " + i + " B");
//                    System.out.println("You must jump");
                    jump++;

                }
            } else if(i < c.length){
//                System.out.println(i + "     " + 1);
//                jump++;
            }
        }
//        System.out.println("jump " + jump);
        return jump;
    }

    static int[] generateRandomArray(int n) {

        int[] myIntArray = new int[n];

        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double number = Math.round(Math.random());

            myIntArray[i] = Math.round((int) number);
            System.out.print(number + " ");
        }

        return myIntArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final String FNAME = "c:\\temp\\clouds.log";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));
        int count = 6;
        int[] d = new int[count];

        int[] e = new int[count];
        int[] myIntArray = new int[]{1, 2, 3};

//        d = generateRandomArray(count);
        int[] f1 = {0, 0, 0, 0, 1, 0};
        int[] f2 = {0, 0, 0, 1, 0, 0};
        int[] g = {0, 0, 1, 0, 0, 1, 0};
        int result = jumpingOnClouds(f2);
        System.out.println("Pituus (main) " + result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
