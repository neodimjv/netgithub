package netgithub1;

import java.util.Scanner;

public class indexOf2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Cümlede hrf aramak için cümle giriniz");
		String cümle=scan.nextLine();
		System.out.println("Kontrol için Harf Giriniz");
		char harf=scan.next().charAt(0);
		
		int index=cümle.lastIndexOf(harf);
		
		if (index==(-1)) {
            System.out.println("harf cumlede kulanilmamis");
        } else {
            System.out.println("harf cumlede kulanilmis");
        }
        
        scan.close();
	}

}
