import java.util.Scanner;
public class kelimeo {
	public kelimeo() 
	{
		Scanner tara= new Scanner(System.in);
		String kelime,harf;
		int secenek,x,y;
		int adet=0;
		char c;
		System.out.println("********************Kelime ��lemleri******************");
		System.out.println("Bir adet kelime giriniz = ");
        kelime =tara.next();
        System.out.println("                      Men�                      \n");
        System.out.println(" 1= Kelimenin i�inde girilen harfin ilk yerini bulma ");
        System.out.println(" 2= Kelimenin i�inde girilen harfin son yerini bulma ");
        System.out.println(" 3= Kelimenin i�inde girilen harfin ka� adet oldu�unu bulma ");
        System.out.println(" 4= Kelimenin i�inde girilen 2 indis de�erinin aras�nda kalan harfleri yazd�rma ");
        secenek=tara.nextInt();
        
        
        
        switch(secenek)
        {
         case 1:
        	 System.out.println("Kelimenin i�inde girilen harfin ilk yerini bulmam i�in bir harf giriniz = ");
        	 	harf=tara.next();
        	 		System.out.print("Girdi�iniz harf "+harf+" dir");
        	 			System.out.println(" Yeri "+kelime.indexOf(harf)+". s�radad�r.");
        	 			break;
         case 2:
        	 System.out.println("Kelimenin i�inde girilen harfin Son yerini bulmam i�in bir harf giriniz = ");
        	 		harf=tara.next();
        	 			System.out.print("Girdi�iniz harf "+harf+" dir");
        	 				System.out.println(" Yeri "+kelime.lastIndexOf(harf)+". s�radad�r.");       	 
        	  		break;
         case 3:
        	 System.out.println("Kelimenin i�inde girilen harfin Ka� adet oldu�unu bulmam i�in bir harf giriniz = ");
        	 		harf=tara.next();
        	 		c=harf.charAt(0);
        	 			for(int i = 0; i < kelime.length(); i++) 
        	 			{
        	 				if(c == kelime.charAt(i)) 
        	 				{
        	 					++adet;
        	 				}
        	 			}
        	 				System.out.print("Girdi�iniz harf "+harf+" dir");
        	 					System.out.println(" "+adet+" tane vard�r. ");
        	  		break;
         case 4:
        	 System.out.println("******** NOT *******"+"\n Say� olarak yerini belirtiniz !!");
        	 System.out.println("Girdi�iz kelimenin hangi harfte ba�lamas�n� istersin  = ");
        	 	x=tara.nextInt();
        	 		System.out.println("Girdi�iz kelimenin hangi harfte bitmesini  istersin  = ");
        	 			y=tara.nextInt();
        	 			if(x==0 && y==0)
        	 				System.out.println(kelime);
        	 			else if(y==0) 
        	 						System.out.println(kelime.substring(x));
        	 			else
        	 			System.out.println(""+kelime.substring(x, y));
        	 			
        	 	 	break;
        	  		
        	  		default:
        	  			System.out.println("Yanl�� tu�a bast�n�z ! ");
        }
	}

/*	public static void main(String[] args) {
		
        
        
	}*/

}
