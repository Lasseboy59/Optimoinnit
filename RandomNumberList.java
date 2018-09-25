// https://stackoverflow.com/questions/28970799/how-to-create-a-array-with-n-random-integers

package hackertest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberList {

    static List<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(1000);
            list.add(number);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = generateRandomArray(10);

        for(Integer number : list) {
            System.out.println("-> " + number);
        }
    }
}
