package netgithub1;

public class Ders4_Emeklisin {

	public static void main(String[] args) {
		
		char cins='E';
		int yas=62;
		
		String sonuc= cins=='K' ? (yas>=60 ? "Emeklisin " : "Emekli deðilsin" ):
								  (yas>=65 ? "Emeklisin " : "Emekli deðilsin" );
		System.out.println(sonuc);
	}

}
