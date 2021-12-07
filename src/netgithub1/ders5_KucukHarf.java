package netgithub1;

import java.util.Scanner;

public class ders5_KucukHarf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen Bir harf giriniz  :");
		char harf=scan.next().charAt(0);
		
		String sonuc= (harf>='a' && harf<='z') ? "KÜÇÜK harf":
					  (harf>='A' && harf<='Z') ? "Büyük Harf Girdiniz":"Küçük harf giriniz";
		System.out.println(sonuc);
						
		
	}

}
