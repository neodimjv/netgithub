package netgithub1;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Harf sayýsý için kelime giriniz");
		String ad=scan.nextLine();
		
		
		String isim="Nedim";
		System.out.println(isim.length());
		String soyad="Görmez";
		System.out.println(soyad.length());
		System.out.println(isim.length()+" "+isim);
				
		System.out.println(ad.length() + " Girilen Harf Sayýsý");

		System.out.println(" Girilen Harf Sayýsý");

	}

}
