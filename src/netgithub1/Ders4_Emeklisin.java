package netgithub1;

public class Ders4_Emeklisin {

	public static void main(String[] args) {
		
		char cins='E';
		int yas=62;
		
		String sonuc= cins=='K' ? (yas>=60 ? "Emeklisin " : "Emekli de�ilsin" ):
								  (yas>=65 ? "Emeklisin " : "Emekli de�ilsin" );
		System.out.println(sonuc);
	}

}
