package netgithub1;

import java.util.Scanner;

public class ders5_KucukHarf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen Bir harf giriniz  :");
		char harf=scan.next().charAt(0);
		
		String sonuc= (harf>='a' && harf<='z') ? "K���K harf":
					  (harf>='A' && harf<='Z') ? "B�y�k Harf Girdiniz":"K���k harf giriniz";
		System.out.println(sonuc);
						
		
	}

}
