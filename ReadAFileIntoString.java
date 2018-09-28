package hackertest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//Read more: https://javarevisited.blogspot.com/2015/09/how-to-read-file-into-string-in-java-7.html#ixzz5RuhKWcb3

public class ReadAFileIntoString {

	public static void main(String[] args) throws IOException {

		String fileAsString = readAFileIntoString();
		System.out.println("Tiedoston (stringin) pituus: " + fileAsString.length());

	}

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

}
