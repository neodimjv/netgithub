package netgithub1;

import java.util.Scanner;

public class ders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("L�tfen bir say� giriniz");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int say�lar=scan.nextInt();
		int say�lar2=scan.nextInt();
		
		topla(say�lar+say�lar2);

	}

	private static void topla(int...say�lar) {
		int toplam=0;
		for (int each:say�lar) {
			toplam+=each;
			
		}
		
		
		System.out.println("Girilen say�lar�n Toplam� :" +toplam);

	}

}
