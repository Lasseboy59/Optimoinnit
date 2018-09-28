/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://stackoverflow.com/questions/2895342/java-how-can-i-split-an-arraylist-in-multiple-small-arraylists
// https://www.quora.com/What-is-the-best-way-to-split-an-array-list-in-Java
public class SplitAListArray {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(
                Arrays.asList(5, 3, 1, 2, 9, 5, 0, 7)
        );
        List<Integer> head = numbers.subList(0, 4);
        List<Integer> tail = numbers.subList(4, 8);
        System.out.println(head); // prints "[5, 3, 1, 2]"
        System.out.println(tail); // prints "[9, 5, 0, 7]"
        System.out.println("");
        Collections.sort(head);
        System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7]"
        tail.add(-1);
        System.out.println(numbers); // prints "[1, 2, 3, 5, 9, 5, 0, 7, -1]"
    }
}
