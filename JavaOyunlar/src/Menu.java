import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner tara= new Scanner (System.in);
		
	    StringBuilder yazi =new StringBuilder();
	    yazi.append("Program�m�za ho�geldiniz fasa fiso\n");
	    yazi.append("0 uygulamadan c�kar \n");
	    yazi.append("1 Yap�lmayan uygulama!!\n");
	    yazi.append("2 isim Tahmin Etme Program� \n");
	    yazi.append("3 Kelime ��lemleri \n");
	    yazi.append("4 Kitap Raf d�zenleme \n");
	    yazi.append("5 Zar Uygulamas� \n");
	    yazi.append("6 Matematik ��lemleri \n");
	    int secim=-1;
	    
        
	    do
	    {   System.out.println(yazi);
	    	secim=tara.nextInt();
	         switch(secim)
	         {
	         case 0:
	         System.out.println("Programdan ��k�� yapt�n�z.");
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
	        		System.out.print("yanl�� i�lem yapt�n�z\n");
	        	 
	         }
	    }while(secim!=0);
		

	}

}
