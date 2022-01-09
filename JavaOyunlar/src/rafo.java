import java.util.Scanner;
public class rafo {
	public rafo() {
		
		int secim;
		Scanner tara= new Scanner (System.in);
		System.out.println("***************Raf Uygulamasý*************");
		System.out.println(" 1 Raflarýn dizilimi A tipi olmasý için");
		System.out.println(" 2 Raflarýn dizilimi B tipi olmasý için");
		secim=tara.nextInt();
		
		
		
		switch(secim) {
		case 1:
			String[] kitap= {"Kýrmýzý","Mavi","Yeþil"};
			int i=(int)Math.pow(3, 1);
			while(i <6) {
				for(int j=0;j<14;j++){
				System.out.println(" Kitap =  "+kitap[i%3]);
				
				}
				i++;
			}
			
			
			break;
			
		case 2:
			String[] kitap2= {"Kýrmýzý","yeþil","Mavi"};
			int a=(int)Math.pow(3, 1);
			while(a <6) {
				for(int k=0;k<14;k++){
				System.out.println(" Kitap =  "+kitap2[a%3]);
				
				}
				a++;
			}
			
			
			break;
			
		default:
			System.out.println("Yanlýþ Tuþa bastýn !!");			
		}
		
		
	}

/*	public static void main(String[] args) {
		

	}*/

}
