/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.util.Scanner;

public class SyotaLukuja {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        System.out.println("Anna kokonaisluku");

        while (true) {
            try {
                x = lukija.nextInt();
            } catch (Exception e) {
                System.out.println("Virheellinen syöte");
                break;
            }
            System.out.println("Annoit luvun " + x);
        }
    }
}
