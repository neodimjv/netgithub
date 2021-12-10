package netgithub1;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int not=scan.nextInt();
		
		switch (not) {
		case 10: System.out.println("iki basamaklý en küçük sayý");			break;
		case 100: System.out.println("3 basamaklý en küçük sayý");			break;
		case 1000: System.out.println("4 basamaklý en küçük sayý");			break;
		default: System.out.println("Ýþine bak");
			break;
		}

	}

}
