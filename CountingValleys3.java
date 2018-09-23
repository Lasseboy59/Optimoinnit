package Hacker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingValleys3 {

	// Complete the countingValleys function below.

//	https://www.rapidtables.com/code/text/ascii-table.html

	static int countingValleys(int n, String s) {

		ArrayList<Integer> list = new ArrayList<Integer>(n);
		ArrayList<Integer> sumList = new ArrayList<Integer>(n);
		int sum = 0;

		char c = s.charAt(0);
		char[] ar = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 'U') {
				list.add(1);
				sum++;
				sumList.add(1);

			} else if (ar[i] == 'D') {
				list.add(-1);
				sum--;
				sumList.add(-1);

			}

//			System.out.println("lat: " + sum);

		}
		int counter = 0, height = 0, outOfValley = 0;
		for (Integer direction : sumList) {
			counter++;

			System.out.print("askel: " + counter);
			System.out.print(" " + direction + " ");
			if (direction == 1) {
				System.out.print(" up");
				height++;
			}

			if (direction == -1) {
				System.out.print(" down");
				height--;
			}

			if(height == 0 && direction == 1) {
				outOfValley++;
				System.out.println(" out of valley");
				
			}
			System.out.println(" height " + height);
			System.out.println();

		}

//		for (int i = 0; i < sumList.get(counter); i++) {
//			height = height + sumList.get(counter);
//		}

		return outOfValley;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		final String FNAME = "c:\\temp\\out_of_valley.txt";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
