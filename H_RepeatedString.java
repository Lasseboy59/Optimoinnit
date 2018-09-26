package hackertest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class H_RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long count = 0, howManyStrings = 0, howManyMarksLeft = 0;
//        System.out.println("Stringin pituus: " + s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        howManyStrings = (n / s.length());
        howManyMarksLeft = (n % s.length());

        count = count * howManyStrings;

//        System.out.println("count of a: " + count);
//        System.out.println("count of strings: " + howManyStrings);
//        System.out.println("count of howManyMarksLeft: " + howManyMarksLeft);

        if (howManyMarksLeft > 0) {
            for (int i = 0; i < howManyMarksLeft; i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
        }

//        System.out.println("count: " + count);

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final String FNAME = "c:\\temp\\repeatedStrings.log";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

//        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String myString = "a";
        String myString2 = "aba";
        String myString3 = "abcac";
        String myString4 = "abcdefghijklmnopqrsat";

        long result = repeatedString(myString, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
