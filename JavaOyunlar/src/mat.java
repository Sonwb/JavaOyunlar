import java.util.Scanner;
public class mat {
	public mat() 
	{
		Scanner tara= new Scanner(System.in);
	double a,b;
	double c;
	int secenek;
    System.out.println("*******Matematik Ýþlemlerine Hoþgeldiniz*********");
    System.out.println("Yapmak Ýstediðiniz Ýþlemi alttaki menüye baðlý kalarak seçiniz !!");
    System.out.println("                      Menü                      \n");
    System.out.println(" 1= 4 iþlem için ");
    System.out.println(" 2= Karekök almak için ");
    System.out.println(" 3= Küpkök almak için ");
    System.out.println(" 4= Kuvvet almak için ");
    System.out.println(" 5= Faktöriyel hesabý almak için ");
    secenek=tara.nextInt();
    
    
    switch(secenek)
    {
    case 1:
    	int s=0,x,y;
   	 System.out.println("1= Toplama için");
   	 System.out.println("2= Çýkarma için");
   	 System.out.println("3= Çarpma için");
   	 System.out.println("4= Bölme için");
   	 	s=tara.nextInt(); 
   	 	switch(s)
   	 	{
   	 	case 1:
   	  	 System.out.println("1.Sayýyý Giriniz " );
   	  	 x=tara.nextInt();
   	   	 System.out.println("2.Sayýyý Giriniz ");
   	   	 y=tara.nextInt();
   	   	 	System.out.println("Sonuc = "+(x+y));
   	 		break;
   	 	case 2:
   	 	System.out.println("1.Sayýyý Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Sayýyý Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x-y));
   	 		break;
   	 	case 3:
   	 	System.out.println("1.Sayýyý Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Sayýyý Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x*y));
   	 		break;
   	 	case 4:
   	 	System.out.println("1.Sayýyý Giriniz " );
  	  	 x=tara.nextInt();
  	   	 System.out.println("2.Sayýyý Giriniz ");
  	   	 y=tara.nextInt();
  	   	 	System.out.println("Sonuc = "+(x/y));
   	 		break;
   	 		default:
   	 		
   	 	}
   	 	
   	 			break;
     case 2:
    	 System.out.println("Karekökünü öðrenmek istediðiniz sayýyý giriniz = ");
    	 	a=tara.nextInt(); 
    	 		System.out.print(a+"'nýn ");
    	 		System.out.println("Kare kökü = "+Math.sqrt(a));
    	 			break;
     case 3:
    	 System.out.println("Küpkökünü öðrenmek istediðiniz sayýyý giriniz = ");
    	 	a=tara.nextInt(); 
    	  		System.out.print(a+"'nýn ");
    	  		System.out.println("Küp kökü = "+Math.pow(a,1.0/3));
    	  		break;
     case 4:
    	 System.out.println("Kuvetini öðrenmek istediðiniz sayýyý giriniz = ");
    	 	a=tara.nextInt(); 
    	 System.out.println("Üssünü giriniz = ");
	    	b=tara.nextInt(); 
    	  		System.out.println("Kuvveti= "+Math.pow(a,b));
    	  		break;
     case 5:
    	 System.out.println("Faktöriyelini öðrenmek istediðiniz sayýyý giriniz = ");
    	 	a=tara.nextInt(); 
    	 	int faktoriyel = 1;
    	 	 	for(int i = 1; i<= a; i++)
    	 	 	{
    	 	 		faktoriyel = faktoriyel * i;
    	 	 	}
    	 	 		System.out.print(a+"'nýn ");
    	 	 		System.out.println("Faktöriyeli = "+faktoriyel);
    	 	 	break;
    	  		
    	  		default:
    	  			System.out.println("Yanlýþ tuþa bastýnýz ! ");
    }
		
	}

/*	public static void main(String[] args)
	{
		
	    
	    

	}*/

}
