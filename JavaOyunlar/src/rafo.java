import java.util.Scanner;
public class rafo {
	public rafo() {
		
		int secim;
		Scanner tara= new Scanner (System.in);
		System.out.println("***************Raf Uygulamas�*************");
		System.out.println(" 1 Raflar�n dizilimi A tipi olmas� i�in");
		System.out.println(" 2 Raflar�n dizilimi B tipi olmas� i�in");
		secim=tara.nextInt();
		
		
		
		switch(secim) {
		case 1:
			String[] kitap= {"K�rm�z�","Mavi","Ye�il"};
			int i=(int)Math.pow(3, 1);
			while(i <6) {
				for(int j=0;j<14;j++){
				System.out.println(" Kitap =  "+kitap[i%3]);
				
				}
				i++;
			}
			
			
			break;
			
		case 2:
			String[] kitap2= {"K�rm�z�","ye�il","Mavi"};
			int a=(int)Math.pow(3, 1);
			while(a <6) {
				for(int k=0;k<14;k++){
				System.out.println(" Kitap =  "+kitap2[a%3]);
				
				}
				a++;
			}
			
			
			break;
			
		default:
			System.out.println("Yanl�� Tu�a bast�n !!");			
		}
		
		
	}

/*	public static void main(String[] args) {
		

	}*/

}
