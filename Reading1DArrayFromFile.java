package hackertest;

//https://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-javahttps://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

public class Reading1DArrayFromFile {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(new File("c:\\temp\\swap_array_in.txt"));
        int[] array = new int[s.nextInt()];
        for (int i = 0; i < array.length; i++) {

            array[i] = s.nextInt();
            System.out.println(i + ":s " + array[i]);

        }

    }
}
