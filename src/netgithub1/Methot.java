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
		System.out.println("l�tfen iki say� giriniz");
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		System.out.println("girilen sayilarin kareler toplamini istiyorsani 2 "
                + "\nkupler toplamini istiyorsaniz 3'e basin");
        int secim=scan.nextInt();
		int c=5;
		
        switch (secim) {
		case 2:
			kare(say�1, say�2);			break;
		case 3:
			k�p(say�1, say�2);		break;
		default:
			System.out.println("Do�ru d�r�st se�im yap");
			
		}
        
        
        
		
	}

	private static void k�p(int say�1, int say�2) {
		@SuppressWarnings("unused")
		int say�lar�nk�p�=(say�1*say�1*say�1)+(say�2*say�2*say�2);
		System.out.println("Say�lar�n k�p�n�n toplam�   : "+ ((say�1*say�1*say�1)+(say�2*say�2*say�2)));
		
	}

	private static void kare(int say�1, int say�2) {
		@SuppressWarnings("unused")
		int say�lar�nKaresi=(say�1*say�1) + (say�2*say�2);
		System.out.println("Say�lar�n Karesinin Toplam� : " + ((say�1*say�1) + (say�2*say�2)));
		
	}
		
		
}
		
			
		
		
	


