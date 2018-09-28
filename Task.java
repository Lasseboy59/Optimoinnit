
package hackertest;

//https://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-javahttps://www.tutorialspoint.com/How-to-read-a-2d-array-from-a-file-in-java
//https://www.tutorialspoint.com/index.htm


import java.io.*;
import java.util.*;      

public class Task {

    private BufferedReader input;
    private PrintWriter output;
    private StringTokenizer stoken;

    String fin = "c:\\temp\\input";
    String fout = "c:\\temp\\output";


    private void solve() { // some solving code...
        int n = nextInt();
        int[] mas = new int[n];
        for (int i = 0; i<n; i++){
            mas[i] = nextInt();
        }
    }



    Task() throws IOException {
        input = new BufferedReader(new FileReader(fin + ".txt"));
        output = new PrintWriter(new FileWriter(fout + ".txt"));

        solve();

        input.close();
        output.flush();
        output.close();
    }


    int nextInt() {
        int intNumber = Integer.parseInt(nextToken());
        System.out.println(intNumber);
        return intNumber;
    }


    long nextLong() {
        return Long.parseLong(nextToken());
    }


    double nextFloat() {
        return Float.parseFloat(nextToken());
    }


    double nextDouble() {
        return Double.parseDouble(nextToken());
    }


    String nextToken() {
        while ((stoken == null) || (!stoken.hasMoreTokens())) {
            try {
                String line = input.readLine();
                stoken = new StringTokenizer(line);
//                System.out.println(stoken.countTokens());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stoken.nextToken();
    }


    public static void main(String[] args) throws IOException {
        new Task();
    }

}