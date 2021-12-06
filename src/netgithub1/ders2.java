package netgithub1;

import java.util.Scanner;

public class ders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen bir sayý giriniz");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int sayýlar=scan.nextInt();
		int sayýlar2=scan.nextInt();
		
		topla(sayýlar+sayýlar2);

	}

	private static void topla(int...sayýlar) {
		int toplam=0;
		for (int each:sayýlar) {
			toplam+=each;
			
		}
		
		
		System.out.println("Girilen sayýlarýn Toplamý :" +toplam);

	}

}
