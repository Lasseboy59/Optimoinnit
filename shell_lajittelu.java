/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omatohjelmat;

public class shell_lajittelu
{
  static int m = 10;

  static void shell(int luvut[], int maara)
  {
   int k, valimatka, vaihto=1;
   valimatka = maara / 2;
   do  
   {
     do
     {
	vaihto = 0;
	for (k = 0; k < (maara - valimatka); k++)
	if (luvut[k] > luvut[k + valimatka])
	{  int temp = luvut[k]; luvut[k] = luvut[k+valimatka];
           luvut[k+valimatka] = temp; vaihto = 1;
        }
     } while (vaihto == 1);
   }
   while ( (valimatka /= 2) > 0);

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
   shell(taulu, 10);

   System.out.println("Lajiteltu taulukko");
   for (i = 0; i < m; i++)
     System.out.println(taulu[i]);
  }
}
