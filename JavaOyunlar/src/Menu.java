import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner tara= new Scanner (System.in);
		
	    StringBuilder yazi =new StringBuilder();
	    yazi.append("Programýmýza hoþgeldiniz fasa fiso\n");
	    yazi.append("0 uygulamadan cýkar \n");
	    yazi.append("1 Yapýlmayan uygulama!!\n");
	    yazi.append("2 isim Tahmin Etme Programý \n");
	    yazi.append("3 Kelime Ýþlemleri \n");
	    yazi.append("4 Kitap Raf düzenleme \n");
	    yazi.append("5 Zar Uygulamasý \n");
	    yazi.append("6 Matematik Ýþlemleri \n");
	    int secim=-1;
	    
        
	    do
	    {   System.out.println(yazi);
	    	secim=tara.nextInt();
	         switch(secim)
	         {
	         case 0:
	         System.out.println("Programdan çýkýþ yaptýnýz.");
	         break;
	         case 1:
	        	  System.out.println("Uygulama yok!!");
	        	 break;
	         case 2:
	        	 new kelimeb();
	        	 break;
	         case 3:
	        	 new kelimeo();
	        	 break;
	         case 4:
	        	 new rafo();
	        	 break;
	         case 5:
	        	 new zaro();
	        	 break;
	         case 6:
	        	 
	        	 new mat();
	        	 break;
	        	 
	        	 default:	 
	        		System.out.print("yanlýþ iþlem yaptýnýz\n");
	        	 
	         }
	    }while(secim!=0);
		

	}

}
