/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackertest;

import java.util.*;
import java.text.*;

public class sadasosat {

    static public void main(String arg[]) {

        Calendar c = Calendar.getInstance();
        int ms1 = c.get(c.MILLISECOND);
        int s1 = c.get(c.SECOND);
        int m1 = c.get(c.MINUTE);
// Tulostetaan kalenterikenttien arvoja:
//        System.out.println(ms1);
//        System.out.println(s1);
//        System.out.println(m1);

// System.out.println(c);   // Tulostaa kaikki kalenteritiedot
// Otetaan kalenteritiedoista saadut millisekunnit irti:
        String jonona = c.toString();
        int alku = jonona.indexOf('=');
        int loppu = jonona.indexOf(',');
        String millisekunnit = jonona.substring(alku + 1, loppu);
        long millisekunnit_ulos = Long.parseLong(millisekunnit);
        System.out.println("Aika millisekunneissa ennen silmukkaa: " + millisekunnit);

// Ajetaan tyhjää silmukkaa
        for (int k = 0; k < 299999999; k++);

        c = Calendar.getInstance();
        jonona = c.toString();
        alku = jonona.indexOf('=');
        loppu = jonona.indexOf(',');
        millisekunnit = jonona.substring(alku + 1, loppu);
        long millisekunnit_ulos2 = Long.parseLong(millisekunnit);
        System.out.println("Aika millisekunneissa silmukan jälkeen: " + millisekunnit);

        System.out.println("Kulunut aika millisekunneissa: " + (millisekunnit_ulos2 - millisekunnit_ulos));

    }
}
