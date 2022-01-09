import java.util.ArrayList;
import java.util.Scanner;

public class zaro {
	public zaro() 
	{	
		Scanner tara=new Scanner(System.in);
	   ArrayList <Integer> zarlar=new ArrayList<Integer>();
	   ArrayList <Integer> zarlar2=new ArrayList<Integer>();
     int zar1=0,zar2=0,s,menu,sayac=0;
     StringBuilder yazi =new StringBuilder();
	    yazi.append("****************Zar atma oyunu****************\n");
	    yazi.append("0 Uygulamayý kapat \n");
	    yazi.append("1 Zar at \n");
	    yazi.append("2 Sonuclarý listele \n");
     
     do {
     System.out.println(yazi);
     menu=tara.nextInt();
    
     switch(menu)
     {
     case 1:
     	zar1=(int) (Math.random()*6+1);
     	zar2=(int) (Math.random()*6+1);
     	System.out.println("Zar atýlýyorrr.....");
     	System.out.println("1.Attýðýnýz zar = "+zar1);
     	System.out.println("2.Attýðýnýz zar = "+zar2);
     	System.out.println("Kaydetmek isterseniz 1'e basýn  = ");
     	s=tara.nextInt();
     	if(s==1)
     	{++sayac;
     	for(int i=0;i<sayac;i++)
		 	{
	            zarlar.add(zar1);
	         
		 	}
		 	for(int k=0;k<sayac;k++)
		 	{
	           
	            zarlar2.add(zar2);
		 	}
		 		break;
     	}
     	else
     		break;
     case 2:
     	System.out.println("**********Sonuclar*******");
     	 for(int j=0;j<sayac;j++){
     		 
	            System.out.println("1. Zarýn Sonuclarý "+zarlar.get(j));
	        }
     	 for(int x=0;x<sayac;x++){
     		 
	            System.out.println("2. Zarýn Sonuclarý  "+zarlar2.get(x));
	        }
     	 
     	 break;
     	 default:
     		 System.out.println("Yanlýþ tuþa bastýnýz !!");


     }
     }while(menu!=0);
		
	}
 

	/*public static void main(String[] args) {
		
	

}*/
}	
