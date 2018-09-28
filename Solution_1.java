package hackertest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution_1 {

    static String findNumber(List<Integer> arr, int k) {

        for (Integer luku : arr) {
            System.out.println("" + luku);
        }
        System.out.println("listan koko: " + arr.size());

        arr.remove(Integer.valueOf(k));

        System.out.println("listan koko: " + arr.size());
        if (arr.contains(k)) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {

//        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        arr.add(8);
        arr.add(12);
        arr.add(7);
        arr.add(34);

        String paluu = findNumber(arr, 12);
        System.out.println(paluu);

    }

}
