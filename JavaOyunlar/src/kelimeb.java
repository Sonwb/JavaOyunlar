import java.util.Scanner;

public class kelimeb {
public kelimeb()
{

	String[] kelimeler = {"ay�e","fatma","huriye","ahmet","muhammed","ali","ekrem","polat","ya��z","efe"};
	int eleman = (int)(Math.random()*kelimeler.length);
	String kelime=kelimeler[eleman];
	 int i,hak=0,a=0,b=0;
	 String uzunluk[] = new String[kelime.length()];
	 System.out.println("***************�S�M TAHM�N ETME OYUNU*************** \n");
	 System.out.println("              Kurallar !!\n�smi bulmak i�in 5 adet hakk�n�z vard�r.");
     System.out.println("Bir isim tahmin ettim bulmaya �al�� :)  \n");
     Scanner tara= new Scanner(System.in);

     for (i = 0; i < kelime.length(); i++)
     {
    	  uzunluk [i] = "_ ";

     }
finish:

     while(hak<5){
             System.out.println("Bir harf giriniz (Hakk�n�z "+(5 -hak) +") : ");
             String harf = tara.nextLine();
             hak++;
             for (i = 0; i < kelime.length(); i++)
         {
                 if (kelime.charAt(i) == harf.charAt(0))
                     {
                    	 uzunluk[i] = harf+" ";
                             a = 1;
                             b++;
                             if (b == kelime.length())
                                   { 
                                	 System.out.println("Se�ti�im isim = " +kelime+" Tebrikler bildin :)"); break finish; 
                                   }
              }
                    
             }
             if (a == 1)
             { a = 0; hak--; }
             	for (i = 0; i < kelime.length(); i++)
             	{
                     System.out.print( uzunluk[i]);

             	}
            
     }
        	if (b != kelime.length()) 
        	{ 
        	System.out.println("\n Beceremedin :( \n tahmin etti�im isim = " + kelime);
        	}
	
}
/*	public static void main(String[] args) {
		
		

         

	}
*/
}
