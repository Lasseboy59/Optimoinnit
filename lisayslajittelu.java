
package omatohjelmat;

public class lisayslajittelu {
    
   static int m = 10;

   static void inssort(int taulu[], int maara)
   {
    int a, i, temp, pos, min, uusiarvo, uusipaikka, nykypaikka;
    min = taulu[0]; 
    pos = 0;  // java vaatii varmasti arvon
    for (i = 0; i < maara; i++)
      if (taulu[i] <= min)
      {
	   min = taulu[i];
       pos = i;
      }
     temp = taulu[0];
     taulu[0] = min;
     taulu[pos] = temp;
     for (uusipaikka = 1; uusipaikka < maara; uusipaikka++)
     {
      uusiarvo = taulu[uusipaikka];
      nykypaikka = uusipaikka;
      while (taulu[nykypaikka - 1] > uusiarvo)
      {
        taulu[nykypaikka] = taulu[nykypaikka - 1];
     	nykypaikka = nykypaikka - 1;
      }
	taulu[nykypaikka] = uusiarvo;
     }
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
   inssort(taulu, 10);

   System.out.println("Lajiteltu taulukko");
   for (i = 0; i < m; i++)
     System.out.println(taulu[i]);
  }

}

