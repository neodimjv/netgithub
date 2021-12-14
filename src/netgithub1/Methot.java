package netgithub1;

import java.util.Scanner;

public class Methot{

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
        
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý giriniz");
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		
		System.out.println("girilen sayilarin kareler toplamini istiyorsani 2 "
                + "\nkupler toplamini istiyorsaniz 3'e basin");
        int secim=scan.nextInt();
		int c=5;
		
        switch (secim) {
		case 2:
			kare(sayý1, sayý2);			break;
		case 3:
			küp(sayý1, sayý2);		break;
		default:
			System.out.println("Doðru dürüst seçim yap");
			
		}
        
        
        
		
	}

	private static void küp(int sayý1, int sayý2) {
		@SuppressWarnings("unused")
		int sayýlarýnküpü=(sayý1*sayý1*sayý1)+(sayý2*sayý2*sayý2);
		System.out.println("Sayýlarýn küpünün toplamý   : "+ ((sayý1*sayý1*sayý1)+(sayý2*sayý2*sayý2)));
		
	}

	private static void kare(int sayý1, int sayý2) {
		@SuppressWarnings("unused")
		int sayýlarýnKaresi=(sayý1*sayý1) + (sayý2*sayý2);
		System.out.println("Sayýlarýn Karesinin Toplamý : " + ((sayý1*sayý1) + (sayý2*sayý2)));
		
	}
		
		
}
		
			
		
		
	


