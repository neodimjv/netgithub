package netgithub1;

import java.util.Scanner;

public class Methot2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz");
		double say�1=scan.nextDouble();
		double say�2=scan.nextDouble();
		System.out.println("L�tfen kare toplam� i�in 2'ye \n K�pler toplam� i�in 3'e bas�n�z");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			karetopla(say�1, say�2);
			
			break;
		case 3:
			k�ptopla(say�1, say�2);
			
			break;

		default:
			break;
		}
		

	}

	private static void k�ptopla(double say�1, double say�2) {
		System.out.println("Say�lar�n K�pleri Toplam� :"+(say�1*say�1*say�1)+(say�2*say�2*say�2));
		
	}

	private static void karetopla(double say�1, double say�2) {
		System.out.println("Say�lar�n Karesi Toplam� :"+(say�1*say�1)+(say�2*say�2));
		
	}

}
