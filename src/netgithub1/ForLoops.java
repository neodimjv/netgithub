package netgithub1;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen 3 er yazd�rmak i�in iki say� giriniz");
        
        int say�1=scan.nextInt();
        int say�2=scan.nextInt();
        
        if (say�1>say�2) {
			
        	for (int i = say�1; i > say�2; i-=3) {
				System.out.print(i+" ");
			}
        	
        	
		} else if (say�1<say�2) {
			
			for (int i = say�2;  i > say�1; i-=3) {
				System.out.print(i+" ");
			}
			
		} else {
			System.out.println("E�it say� girdiniz");

		}{

		}

	}

}
