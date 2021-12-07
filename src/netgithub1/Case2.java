package netgithub1;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		System.out.println("Lütfen öðrenmek istediðiniz gün no giriniz");
		
		Scanner scan=new Scanner(System.in);
		int gün=scan.nextInt();
		
		switch (gün) {
		case 1:		
		case 2:
		case 3:
		case 4:
		case 5:		System.out.println("HAfta Ýçi");		break;
		
		case 6:
		case 7:		System.out.println("Hafta Sonu");		break;

		default:	System.out.println("Ditkat ettttt!!!!");

	}
		scan.close();
	}
}
