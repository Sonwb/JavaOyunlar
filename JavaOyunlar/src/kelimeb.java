import java.util.Scanner;

public class kelimeb {
public kelimeb()
{

	String[] kelimeler = {"ayþe","fatma","huriye","ahmet","muhammed","ali","ekrem","polat","yaðýz","efe"};
	int eleman = (int)(Math.random()*kelimeler.length);
	String kelime=kelimeler[eleman];
	 int i,hak=0,a=0,b=0;
	 String uzunluk[] = new String[kelime.length()];
	 System.out.println("***************ÝSÝM TAHMÝN ETME OYUNU*************** \n");
	 System.out.println("              Kurallar !!\nÝsmi bulmak için 5 adet hakkýnýz vardýr.");
     System.out.println("Bir isim tahmin ettim bulmaya çalýþ :)  \n");
     Scanner tara= new Scanner(System.in);

     for (i = 0; i < kelime.length(); i++)
     {
    	  uzunluk [i] = "_ ";

     }
finish:

     while(hak<5){
             System.out.println("Bir harf giriniz (Hakkýnýz "+(5 -hak) +") : ");
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
                                	 System.out.println("Seçtiðim isim = " +kelime+" Tebrikler bildin :)"); break finish; 
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
        	System.out.println("\n Beceremedin :( \n tahmin ettiðim isim = " + kelime);
        	}
	
}
/*	public static void main(String[] args) {
		
		

         

	}
*/
}
