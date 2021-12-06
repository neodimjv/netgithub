package netgithub1;

import java.util.Scanner;

public class ders3_tekcift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen Bir sayý giriniz  :");
		int sayý=scan.nextInt();
		
		if (sayý%2==0) {
			System.out.println("******Girilen sayý çift sayý*******");
		} else {
			System.out.println("*******Girilen sayý tek sayý*******");
		}
		scan.close();
	}

}
