package netgithub1;

import java.util.Scanner;

public class indexOf2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("C�mlede hrf aramak i�in c�mle giriniz");
		String c�mle=scan.nextLine();
		System.out.println("Kontrol i�in Harf Giriniz");
		char harf=scan.next().charAt(0);
		
		int index=c�mle.lastIndexOf(harf);
		
		if (index==(-1)) {
            System.out.println("harf cumlede kulanilmamis");
        } else {
            System.out.println("harf cumlede kulanilmis");
        }
        
        scan.close();
	}

}
