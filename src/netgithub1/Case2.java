package netgithub1;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		System.out.println("L�tfen ��renmek istedi�iniz g�n no giriniz");
		
		Scanner scan=new Scanner(System.in);
		int g�n=scan.nextInt();
		
		switch (g�n) {
		case 1:		
		case 2:
		case 3:
		case 4:
		case 5:		System.out.println("HAfta ��i");		break;
		
		case 6:
		case 7:		System.out.println("Hafta Sonu");		break;

		default:	System.out.println("Ditkat ettttt!!!!");

	}
		scan.close();
	}
}
