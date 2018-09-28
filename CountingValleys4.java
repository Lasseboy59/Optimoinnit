package hackertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingValleys4 {

	// Complete the countingValleys function below.

//	https://www.rapidtables.com/code/text/ascii-table.html

	static int countingValleys(int n, String s) {

		ArrayList<Integer> list = new ArrayList<Integer>(n);
		ArrayList<Integer> sumList = new ArrayList<Integer>(n);

//		System.out.println("Valleys - pituus: " + s.length());

//		char c = s.charAt(0);
		char[] ar = s.toCharArray();

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 'U') {
				list.add(1);
				sumList.add(1);
			} else if (ar[i] == 'D') {
				list.add(-1);
				sumList.add(-1);
			}

		}
		int counter = 0, height = 0, outOfValley = 0;
		for (Integer direction : sumList) {
			counter++;

			//System.out.print("askel: " + counter);
			//System.out.print(" " + direction + " ");
			if (direction == 1) {
//				System.out.print(" up");
				height++;
			}

			if (direction == -1) {
				//System.out.print(" down");
				height--;
			}

			if (height == 0 && direction == 1) {
				outOfValley++;
//				System.out.println(" out of valley");

			}
//			System.out.println(" height " + height);
//			System.out.println();

		}

		return outOfValley;
	}

	// ****************************************************************************//

	private static String readAFileIntoString() throws FileNotFoundException, IOException {
		// String fileName = "c:\\temp\\test_5.log";
		String fileName = "c:\\temp\\counting_valleys_test14.log";
		InputStream is = new FileInputStream(fileName);
		// InputStream is = new FileInputStream("c:\\temp\\test_5.log");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		String line = buf.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append("\n");
			line = buf.readLine();
		}

		// delete the last new line separator
		sb.deleteCharAt(sb.length() - 1);
		String fileAsString = sb.toString();

		return fileAsString;
	}

	// ****************************************************************************//

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		final String FNAME = "c:\\temp\\out_of_valley.txt";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FNAME));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		System.out.println("luetaan ---");
		String fileAsString = readAFileIntoString();

		System.out.println("luettu ja hyppy countOfValleys ---");
		int result = countingValleys(n, fileAsString);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
