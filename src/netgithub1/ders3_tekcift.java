package netgithub1;

import java.util.Scanner;

public class ders3_tekcift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen Bir say� giriniz  :");
		int say�=scan.nextInt();
		
		if (say�%2==0) {
			System.out.println("******Girilen say� �ift say�*******");
		} else {
			System.out.println("*******Girilen say� tek say�*******");
		}
		scan.close();
	}

}
