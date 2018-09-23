import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

public class H_Listalla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            Integer luettu = Integer.parseInt(lukija.nextLine());
            if (luettu.equals(-1)) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("Lista:");
        Collections.sort(lista);
        for(Integer num :lista){
            System.out.println(num);
        }
        System.out.println("Yhteensä: " + lista.size());

    }
}