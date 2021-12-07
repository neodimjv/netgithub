package netgithub1;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
	
	System.out.println("Lütfen öðrenmek istediðiniz gün no giriniz");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	int gün=scan.nextInt();
	
	switch (gün) {
	case 1:System.out.println("Pazartesi");		break;
	case 2:System.out.println("salý");		break;
	case 3:System.out.println("çar");		break;
	case 4:System.out.println("per");		break;
	case 5:System.out.println("cum");		break;
	case 6:System.out.println("cts");		break;
	case 7:System.out.println("Pazar");		break;

	default:	System.out.println("Ditkat ettttt!!!!");
		break;
	}
	
	
	
		

	}

}
