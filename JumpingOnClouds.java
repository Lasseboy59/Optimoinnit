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
            } 
        }
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

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
