package netgithub1;

import java.util.Scanner;

public class Emekli {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Yaþýnýzý Giriniz");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsýn");
		} else {
			System.out.println("Emekli Olabilirsin");
		}
		scan.close();

	}

}
