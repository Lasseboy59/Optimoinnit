/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.util.Scanner;

public class BinHaku {

    static int m = 10;

    static public boolean binhaku(int luku, int luvut[]) {
        int mediaanialkio;
        int mediaani;
        int eka = 0;
        int viime = m - 1;
        do {
            mediaani = (viime + eka) / 2;
            mediaanialkio = luvut[mediaani];
            if (luku < mediaanialkio) {
                viime = mediaani - 1;
            } else {
                eka = mediaani + 1;
            }
        } while (!(luku == mediaanialkio || eka > viime));
        return (luku == mediaanialkio) ? true : false;
    }

    static public void main(String arg[]) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;
        int i, j;
        int taulu[] = new int[m];

        for (i = 0; i < m; i++) {
            taulu[i] = (int) (50 * Math.random());
        }

        for (i = 0; i < m; i++) {
            System.out.println(taulu[i]);
        }

        // Lajitellaan
        for (i = 0; i < m - 1; i++) {
            for (j = i + 1; j < m; j++) {
                if (taulu[i] > taulu[j]) {
                    int temp = taulu[i];
                    taulu[i] = taulu[j];
                    taulu[j] = temp;
                }
            }
        }

        for (i = 0; i < m; i++) {
            System.out.println(taulu[i]);
        }

        System.out.print("Anne luku jota etsitään listasta! ");
        luku = Integer.parseInt(lukija.nextLine());

        boolean onko = binhaku(2, taulu);
        System.out.println("-------------");
        System.out.println(onko);

    }
}
