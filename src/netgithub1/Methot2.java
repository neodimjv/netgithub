package netgithub1;

import java.util.Scanner;

public class Methot2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz");
		double sayý1=scan.nextDouble();
		double sayý2=scan.nextDouble();
		System.out.println("Lütfen kare toplamý için 2'ye \n Küpler toplamý için 3'e basýnýz");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			karetopla(sayý1, sayý2);
			
			break;
		case 3:
			küptopla(sayý1, sayý2);
			
			break;

		default:
			break;
		}
		

	}

	private static void küptopla(double sayý1, double sayý2) {
		System.out.println("Sayýlarýn Küpleri Toplamý :"+(sayý1*sayý1*sayý1)+(sayý2*sayý2*sayý2));
		
	}

	private static void karetopla(double sayý1, double sayý2) {
		System.out.println("Sayýlarýn Karesi Toplamý :"+(sayý1*sayý1)+(sayý2*sayý2));
		
	}

}
