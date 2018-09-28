
package hackertest;

import java.util.Date;
import java.util.Vector;


public class vectortaulukonlajittelu {
   static int m = 200000;

   static void lajittele(Vector v, int maara)
   {
    Object temp1 = new Object(); 
    Object temp2 = new Object(); 
    for (int k = 0; k < maara - 1; k++)
     for (int s = k + 1; s < maara; s++)
       if (v.elementAt(k).toString().compareTo
           (v.elementAt(s).toString()) > 0 )
      {
       temp1 = v.elementAt(k); 
       temp2 = v.elementAt(s); 
       v.setElementAt(temp2,k);
       v.setElementAt(temp1, s);
       }
    }

  static public void main (String arg[])
  {
  Date d = new Date();
  int h = d.getHours();
  int mi = d.getMinutes();
  int s = d.getSeconds();   
  System.out.println("ALKUAIKA: " + h +":"+mi+":" + s);

  Vector x = new Vector();
  
  for (int k = 0; k < 10; k++)
  {
    Integer p = new Integer((int) (10 * Math.random()));    
    x.insertElementAt(p, k);
  }

  System.out.println("Lajittelematon taulukko (alkuperäinen)");
  for (int k = 0; k < 10; k++)
    System.out.println(x.elementAt(k));    

  lajittele (x, 10);

  System.out.println("Lajiteltu taulukko");
  for (int k = 0; k < 10; k++)
    System.out.println(x.elementAt(k));    
 
  Date e = new Date();
  h = e.getHours();
  mi = e.getMinutes();
  s = e.getSeconds();   
  System.out.println("LOPPUAIKA: " + h +":"+mi+":" + s);

  }

}
