/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayKoe {

    public static void main(String[] args) {

        {
            //First ArrayList
            List<Integer> arraylist1 = new ArrayList<Integer>();
            arraylist1.add(1);
            arraylist1.add(2);
            arraylist1.add(3);

            //Second ArrayList
            List<Integer> arraylist2 = new ArrayList<Integer>();
            arraylist2.add(5);
            arraylist2.add(6);
            arraylist2.add(7);

            //New ArrayList
            List<Integer> al = new ArrayList<Integer>();
            al.addAll(arraylist1);
            al.addAll(arraylist2);

            //Displaying elements of the joined ArrayList
            for (Integer temp : al) {
                System.out.println(temp);
            }
        }
    }
}
