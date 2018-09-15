/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omatohjelmat;


// https://stackoverflow.com/questions/692569/how-can-i-count-the-time-it-takes-a-function-to-complete-in-java


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PitkaListaHae {

    static List<Integer> generateRandomArray(int n) {

//        ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>();
//        ArrayList<Integer> nodeList = new ArrayList<Integer>();
        System.out.println("creating a random list with size of: " + n / (1000000));
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int number = random.nextInt(100000);
            list.add(number);
        }

        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            al.addAll(list);
        }
        
        al.addAll(list);
        al.addAll(list);
        al.addAll(list);
        al.addAll(list);
        al.addAll(list);

//        for (int i = 0; i < 5; i++) {
//            al.addAll(al);
//        }
        System.out.println("size of: " + al.size());
        System.out.println("size is: " + 100000000);

        long timeLapseBegin = System.nanoTime();
        System.out.println("-------- NUMBER -------");
        
        if (al.contains(1)) {
            System.out.println("Found: " + 1);
        } else {
            System.out.println("Not found: " + 1);
        }

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- FOUND or NOT ^ -------");
//        nodes.add(list);
//        nodes.add(list);
        return list;
    }

    public static void main(String[] args) {

        System.out.println("-------- Luodaan lista -------");
        long timeLapseBegin = System.nanoTime();
//                           123456789
        generateRandomArray(10000000);
//        generateRandomArray(100);

        timeLapseBegin = System.nanoTime() - timeLapseBegin;
        System.out.println("secs: " + (double) timeLapseBegin / 1000000000);
        System.out.println("-------- program ended -------");
    }
}
