package netgithub1;

import java.util.Scanner;

public class Emekli {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Ya��n�z� Giriniz");
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazs�n");
		} else {
			System.out.println("Emekli Olabilirsin");
		}
		scan.close();

	}

}
