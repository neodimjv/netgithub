package netgithub1;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
	
	System.out.println("L�tfen ��renmek istedi�iniz g�n no giriniz");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	int g�n=scan.nextInt();
	
	switch (g�n) {
	case 1:System.out.println("Pazartesi");		break;
	case 2:System.out.println("sal�");		break;
	case 3:System.out.println("�ar");		break;
	case 4:System.out.println("per");		break;
	case 5:System.out.println("cum");		break;
	case 6:System.out.println("cts");		break;
	case 7:System.out.println("Pazar");		break;

	default:	System.out.println("Ditkat ettttt!!!!");
		break;
	}
	
	
	
		

	}

}
