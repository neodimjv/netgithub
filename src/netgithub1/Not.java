package netgithub1;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int not=scan.nextInt();
		
		switch (not) {
		case 10: System.out.println("iki basamakl� en k���k say�");			break;
		case 100: System.out.println("3 basamakl� en k���k say�");			break;
		case 1000: System.out.println("4 basamakl� en k���k say�");			break;
		default: System.out.println("��ine bak");
			break;
		}

	}

}
