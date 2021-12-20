package netgithub1;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 3 er yazdýrmak için iki sayý giriniz");
        
        int sayý1=scan.nextInt();
        int sayý2=scan.nextInt();
        
        if (sayý1>sayý2) {
			
        	for (int i = sayý1; i > sayý2; i-=3) {
				System.out.print(i+" ");
			}
        	
        	
		} else if (sayý1<sayý2) {
			
			for (int i = sayý2;  i > sayý1; i-=3) {
				System.out.print(i+" ");
			}
			
		} else {
			System.out.println("Eþit sayý girdiniz");

		}{

		}

	}

}
