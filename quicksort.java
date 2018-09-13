
package omatohjelmat;


public class quicksort {
    
  static int m = 10;

  static void lajittele(int eka, int viime,int luvut[])
  {
   int alku, vasen, oikea, temp;
   vasen = eka;
   oikea = viime;
   alku = luvut[(eka + viime) / 2];
   do
   {
    while (luvut[vasen] < alku)
    vasen = vasen +1;
    while (alku < luvut[oikea])
    oikea = oikea - 1;
    if (vasen <= oikea)
    {
      temp = luvut[vasen]; luvut[vasen] = luvut[oikea];
      luvut[oikea] = temp; 
    vasen = vasen + 1;
    oikea = oikea - 1;
    }
   }
   while ((oikea > vasen));
   if (eka < oikea) lajittele(eka, oikea, luvut);
   if (vasen < viime) lajittele(vasen, viime, luvut);
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
   lajittele(0, m-1, taulu);

   System.out.println("Lajiteltu taulukko");
   for (i = 0; i < m; i++)
     System.out.println(taulu[i]);
  }
}
