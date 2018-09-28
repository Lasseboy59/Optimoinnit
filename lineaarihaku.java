
package hackertest;

public class lineaarihaku {

    static public void main(String arg[]) {
        int m = 10;
        int i;
        int j = 5;
        int taulu[] = new int[m];

        for (i = 0; i < m; i++) {
            taulu[i] = (int) (5 * Math.random());
//            taulu[i] = j++;
            
        }

        for (i = 0; i < m; i++) {
            System.out.println(taulu[i]);
        }

        int haettava = 7;
        boolean loyty = false;

        for (i = 0; i < m; i++) {
            if (taulu[i] == haettava) {
                loyty = true;
                break;
            }
        }

        if (loyty) {
            System.out.println("Löytyi kohdasta " + i);
        } else {
            System.out.println("Ei löytynyt");
        }

    }
}
