/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omatohjelmat;

import java.util.Scanner;

public class SyotaLukuja2 {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        boolean virhe = false;
        do {
            System.out.println("Anna kokonaisluku -");
            try {
                virhe = false;
                x = lukija.nextInt();
            } catch (Exception e) {
                System.out.println("Virheellinen syöte");
                if (lukija.hasNext()) {
                    lukija.nextLine();
                }
                virhe = true;
            }
        } while (virhe);
        System.out.println("Annoit luvun " + x);
    }
}
