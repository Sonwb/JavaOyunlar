import java.util.Scanner;
public class kelimeo {
	public kelimeo() 
	{
		Scanner tara= new Scanner(System.in);
		String kelime,harf;
		int secenek,x,y;
		int adet=0;
		char c;
		System.out.println("********************Kelime Ýþlemleri******************");
		System.out.println("Bir adet kelime giriniz = ");
        kelime =tara.next();
        System.out.println("                      Menü                      \n");
        System.out.println(" 1= Kelimenin içinde girilen harfin ilk yerini bulma ");
        System.out.println(" 2= Kelimenin içinde girilen harfin son yerini bulma ");
        System.out.println(" 3= Kelimenin içinde girilen harfin kaç adet olduðunu bulma ");
        System.out.println(" 4= Kelimenin içinde girilen 2 indis deðerinin arasýnda kalan harfleri yazdýrma ");
        secenek=tara.nextInt();
        
        
        
        switch(secenek)
        {
         case 1:
        	 System.out.println("Kelimenin içinde girilen harfin ilk yerini bulmam için bir harf giriniz = ");
        	 	harf=tara.next();
        	 		System.out.print("Girdiðiniz harf "+harf+" dir");
        	 			System.out.println(" Yeri "+kelime.indexOf(harf)+". sýradadýr.");
        	 			break;
         case 2:
        	 System.out.println("Kelimenin içinde girilen harfin Son yerini bulmam için bir harf giriniz = ");
        	 		harf=tara.next();
        	 			System.out.print("Girdiðiniz harf "+harf+" dir");
        	 				System.out.println(" Yeri "+kelime.lastIndexOf(harf)+". sýradadýr.");       	 
        	  		break;
         case 3:
        	 System.out.println("Kelimenin içinde girilen harfin Kaç adet olduðunu bulmam için bir harf giriniz = ");
        	 		harf=tara.next();
        	 		c=harf.charAt(0);
        	 			for(int i = 0; i < kelime.length(); i++) 
        	 			{
        	 				if(c == kelime.charAt(i)) 
        	 				{
        	 					++adet;
        	 				}
        	 			}
        	 				System.out.print("Girdiðiniz harf "+harf+" dir");
        	 					System.out.println(" "+adet+" tane vardýr. ");
        	  		break;
         case 4:
        	 System.out.println("******** NOT *******"+"\n Sayý olarak yerini belirtiniz !!");
        	 System.out.println("Girdiðiz kelimenin hangi harfte baþlamasýný istersin  = ");
        	 	x=tara.nextInt();
        	 		System.out.println("Girdiðiz kelimenin hangi harfte bitmesini  istersin  = ");
        	 			y=tara.nextInt();
        	 			if(x==0 && y==0)
        	 				System.out.println(kelime);
        	 			else if(y==0) 
        	 						System.out.println(kelime.substring(x));
        	 			else
        	 			System.out.println(""+kelime.substring(x, y));
        	 			
        	 	 	break;
        	  		
        	  		default:
        	  			System.out.println("Yanlýþ tuþa bastýnýz ! ");
        }
	}

/*	public static void main(String[] args) {
		
        
        
	}*/

}
