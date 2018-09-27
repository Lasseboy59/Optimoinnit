
package hackertest;


public class kuplalajittelu {
    
  static int m = 10;

  static void kupla(int taulu[], int maara)
  {
   int ok, i, temp;
   do
   {
     ok = 1;
     for (i=0; i < maara-1; i++)
     {
       if (taulu[i] > taulu[i+1])
       {
        temp = taulu[i];
	taulu[i] = taulu[i+1];
	taulu[i+1] = temp;
	ok = 0;
       }      
     }
    }
  while (ok != 1);
}


  static public void main (String arg[])
  {
   int i,j;
   int taulu[] = new int[m];
   for (i = 0; i < m; i++)
      taulu[i] = (int) (100 * Math.random()) ;

   System.out.println("Lajittelematon taulukko");
   for (i = 0; i < m; i++)
     System.out.println(taulu[i]);

 
   // Lajitellaan
   kupla(taulu, 10);

   System.out.println("Lajiteltu taulukko");
   for (i = 0; i < m; i++)
     System.out.println(taulu[i]);
  }

}
