package omatohjelmat;

import java.util.Calendar;

public class Vaihtolajittelu_ajanotto {

    static int m = 10000;

    static public void lajittele(int taulu[]) {
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (taulu[i] > taulu[j]) {
                    int temp = taulu[i];
                    taulu[i] = taulu[j];
                    taulu[j] = temp;
                }
            }
        }
    }

    static public void main(String arg[]) {

        Calendar c = Calendar.getInstance();
        int ms1 = c.get(c.MILLISECOND);
        int s1 = c.get(c.SECOND);
        int m1 = c.get(c.MINUTE);
        int i, j;

        java.util.Random r = new java.util.Random();

        
       int taulu[] = new int[m];
        for (i = 0; i < m; i++) {
            taulu[i] = (int) (100000 * Math.random());
        }

        System.out.println("Lajittelematon taulukko");
        for (i = 0; i < m; i++) {
            System.out.println(taulu[i]);
        }

        String jonona = c.toString();
        int alku = jonona.indexOf('=');
        int loppu = jonona.indexOf(',');
        String millisekunnit = jonona.substring(alku + 1, loppu);
        long millisekunnit_ulos = Long.parseLong(millisekunnit);
        System.out.println("Aika millisekunneissa ennen silmukkaa: " + millisekunnit);

        // Lajitellaan
        lajittele(taulu);

        c = Calendar.getInstance();
        jonona = c.toString();
        alku = jonona.indexOf('=');
        loppu = jonona.indexOf(',');
        millisekunnit = jonona.substring(alku + 1, loppu);
        long millisekunnit_ulos2 = Long.parseLong(millisekunnit);
        System.out.println("Aika millisekunneissa silmukan jälkeen: " + millisekunnit);
        long sekunnit = (millisekunnit_ulos2 - millisekunnit_ulos)/1000;
        long millit = (millisekunnit_ulos2 - millisekunnit_ulos)%1000;        
        System.out.println("Kulunut aika millisekunneissa: " + (millisekunnit_ulos2 - millisekunnit_ulos) + "\n");
        
        System.out.println("Sekunnit " + sekunnit + " millisekunnit " + millit);
        

//        System.out.println("Lajiteltu taulukko");
//        for (i = 0; i < m; i++) {
//            System.out.println(taulu[i]);
//        }
    }
}
