package hackertest;

import java.util.ArrayList;
import java.util.List;

public class CreateOddNumbers {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        long timeLapseBegin = System.nanoTime();
        System.out.println("-------- Jump to oddNumbers() -------");

        arr = oddNumbers(1, 100000);

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- BACK -------");

        System.out.println("---------------------");
        for (Integer numbers : arr) {
//            System.out.println("-> " + numbers);
        }
        int sizeOfArray = arr.size();
        System.out.println("last one " + (arr.get(sizeOfArray - 1)));
    }

    static List<Integer> oddNumbers(int l, int r) {

        int leftBorder = 0, rightBorder = 0;

        if (l % 2 == 1) {
            leftBorder = l;
        } else {
            leftBorder = l + 1;
        }

        if (r % 2 == 1) {
            rightBorder = r;
        } else {
            rightBorder = r - 1;
        }

        int initialSize = ((rightBorder - leftBorder) / 2) + 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>(initialSize);
        int toBeadded = leftBorder;

        for (int i = 0; i < initialSize; i++) {
            numbers.add(toBeadded);
            toBeadded += 2;
        }

        return numbers;
    }

}
