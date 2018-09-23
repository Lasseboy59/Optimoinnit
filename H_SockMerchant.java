package omatohjelmat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class H_SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	
        Arrays.sort(ar); 
        
 
      int parit = 0;

      for (int i = 0; i < ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
//				System.out.println("onko pari:" + ar[i] + " " + ar[i+1]);
				parit++;
				i++;
			}
		}

//      System.out.println("pareja: " + parit);
      return parit;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        final String FNAME = "c:\\temp\\solution_test.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}