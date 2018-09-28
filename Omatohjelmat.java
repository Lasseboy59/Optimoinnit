//https://codereview.stackexchange.com/questions/121489/using-scanner-nextint-whilst-ignoring-rest-of-line
package hackertest;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeObject.keys;


public class Omatohjelmat {

    public static void main(String[] args) throws Exception {

        lueLuvut();
    }

    public static void lueLuvut() {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettujaLukuja = 0;
        int luettu = 0;
        System.out.print("Anna summattavia lukuja: ");
//        while (luettu >= 0) {
//            luettu = Integer.parseInt(lukija.nextLine());
//            luettujaLukuja = luettujaLukuja + 1;
//            if (luettu == 0) {
//                break;
//            }
//
//            summa += luettu;
//        }
        String line = " ";
        int number = 0;

        while (lukija.hasNext()) {
            line = lukija.next();
            number = Integer.parseInt(line);
            if (line.equals(" ")) {  // Fix to avoid endless loop
                break;                  // Fix to avoid endless loop
            }                           // Fix to avoid endless loop
        }

        System.out.println("Summa lopussa: " + number);

    }
}
