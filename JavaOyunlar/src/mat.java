import java.util.Scanner;
public class mat {
	public mat() 
	{
		Scanner tara= new Scanner(System.in);
	double a,b;
	double c;
	int secenek;
    System.out.println("*******Matematik ��lemlerine Ho�geldiniz*********");
    System.out.println("Yapmak �stedi�iniz ��lemi alttaki men�ye ba�l� kalarak se�iniz !!");
    System.out.println("                      Men�                      \n");
    System.out.println(" 1= 4 i�lem i�in ");
    System.out.println(" 2= Karek�k almak i�in ");
    System.out.println(" 3= K�pk�k almak i�in ");
    System.out.println(" 4= Kuvvet almak i�in ");
    System.out.println(" 5= Fakt�riyel hesab� almak i�in ");
    secenek=tara.nextInt();
    
    
    switch(secenek)
    {
    case 1:
    	int s=0,x,y;
   	 System.out.println("1= Toplama i�in");
   	 System.out.println("2= ��karma i�in");
   	 System.out.println("3= �arpma i�in");
   	 System.out.println("4= B�lme i�in");
   	 	s=tara.nextInt(); 
   	 	switch(s)
   	 	{
   	 	case 1:
   	  	 System.out.println("1.Say�y� Giriniz " );
   	  	 x=tara.nextInt();
   	   	 System.out.println("2.Say�y� Giriniz ");
   	   	 y=tara.nextInt();
   	   	 	System.out.println("Sonuc = "+(x+y));
   	 		break;
   	 	case 2:
   	 	System.out.println("1.Say�y� Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Say�y� Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x-y));
   	 		break;
   	 	case 3:
   	 	System.out.println("1.Say�y� Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Say�y� Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x*y));
   	 		break;
   	 	case 4:
   	 	System.out.println("1.Say�y� Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Say�y� Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x/y));
   	 		break;
   	 		default:
   	 		
   	 	}
   	 	
   	 			break;
     case 2:
    	 System.out.println("Karek�k�n� ��renmek istedi�iniz say�y� giriniz = ");
    	 	a=tara.nextInt(); 
    	 		System.out.print(a+"'n�n ");
    	 		System.out.println("Kare k�k� = "+Math.sqrt(a));
    	 			break;
     case 3:
    	 System.out.println("K�pk�k�n� ��renmek istedi�iniz say�y� giriniz = ");
    	 	a=tara.nextInt(); 
    	  		System.out.print(a+"'n�n ");
    	  		System.out.println("K�p k�k� = "+Math.pow(a,1.0/3));
    	  		break;
     case 4:
    	 System.out.println("Kuvetini ��renmek istedi�iniz say�y� giriniz = ");
    	 	a=tara.nextInt(); 
    	 System.out.println("�ss�n� giriniz = ");
	    	b=tara.nextInt(); 
    	  		System.out.println("Kuvveti= "+Math.pow(a,b));
    	  		break;
     case 5:
    	 System.out.println("Fakt�riyelini ��renmek istedi�iniz say�y� giriniz = ");
    	 	a=tara.nextInt(); 
    	 	int faktoriyel = 1;
    	 	 	for(int i = 1; i<= a; i++)
    	 	 	{
    	 	 		faktoriyel = faktoriyel * i;
    	 	 	}
    	 	 		System.out.print(a+"'n�n ");
    	 	 		System.out.println("Fakt�riyeli = "+faktoriyel);
    	 	 	break;
    	  		
    	  		default:
    	  			System.out.println("Yanl�� tu�a bast�n�z ! ");
    }
		
	}

/*	public static void main(String[] args)
	{
		
	    
	    

	}*/

}
