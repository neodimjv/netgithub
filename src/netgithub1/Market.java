package netgithub1;

import java.util.Scanner;

public class Market {

	

	public static void main(String[] args) {
		/*====================PROJEMIZ===================================
			     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler 1 manav, 2
			     * sarkuteri, 3 market secime gor , 4-urunleri listele ve 5-fiyatlari gelsin
			     * 
			     * Basrili Market al��-veri� program�. 1. Ad�m:
			     * �r�nler ve fiyatlar� i�eren listeleri olu�turunuz. No �r�n Fiyat ==== =======
			     * ========= 00 Domates 2.10 TL ,  01 Patates 3.20 TL , 02 Biber 1.50 TL , 03 
			     * So�an 2.30 TL  ,04 Havu� 3.10 TL   05 Elma 1.20 TL   06 Muz 1.90 TL   07 �ilek 
			     * 6.10 TL    08 Kavun 4.30 TL   09 �z�m 2.70 TL    10 Limon 0.50 TL
			     * 
			     * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz. 
			        * 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
			          4. Ad�m: Al�nacak bu �r�n�
			     * sepete ekleyiniz ve Sepeti yazd�r�n�z.
			         5. Ba�ka bir �r�n al�p almak
			     * istemedi�ini sorunuz. 
			         6. E�er devam etmek istiyorsa yeniden �r�n se�me
			     * k�sm�na y�nlendiriniz. 
			         7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve
			     * �deme sonras�nda program� bitiriniz
			     */
		
		System.out.println("Lutfen yapmak istediginiz islemi giriniz\n1->Manav\n2->�ark�teri\n3->Market\n4->�r�nleri Listele\n"
                + "5->Fiyatlar");
		 Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        
        
        switch (secim) {
        
        case 1:
            manav();
            break;
        case 2:   
            Sark�teri();
            break;
            
        case 3:
            Market();
            break;
            
        case 4:
            �r�nler(); 
            
            break;
            
        case '5':
            fiyatlar();
            break;
        
        default:
            System.out.println("Lutfen gecerli islem seciniz.");
            break;
        }
        
        System.out.println("Ba�ka bir �r�n almak istiyor musunuz?\n"
        		+ "Evet ise 1 e Hay�r ise 2 ye bas�n�z");
        Scanner sec = new Scanner(System.in);
        int sayi = sec.nextInt();
        
        if (sayi==1) {
        	�r�nler();
			
		} else {
			System.out.println("�deme Se�enekleri : \n***Kredi Kart� \n***Banka Kart� \n***Kap�da �deme ");

		}

	}

	private static void fiyatlar() {
		// TODO Auto-generated method stub
		
	}

	private static void �r�nler() {
		System.out.println("A�a��daki Listeden �r�n Se�iniz");
		 System.out.println("->0 Domates 2.10 TL    ->1 Patates 3.20 TL     ->2 Biber 1.50 TL      ->3 So�an 2.30 TL\n"
         		+"->4 Havu� 3.10 TL      ->5 Elma 1.20 TL        ->6 Muz 1.90 TL        ->7 �ilek 10 TL    \n->8 Kavun 4.30 TL      ->9 �z�m 2.70 TL       ->10 Limon 0.50 TL");
		Scanner scan = new Scanner(System.in);
        int �r�n = scan.nextInt();
        System.out.println("Ka� kg almak istiyorsunuz");
        Scanner kg = new Scanner(System.in);
		double kilogram=kg.nextDouble();
		
		
		
		
switch(�r�n) {
		
		case 0:	System.out.println("Toplam �r�n Tutar� :"+2.1*kilogram);		break;
		case 1:	System.out.println("Toplam �r�n Tutar� :"+3.2*kilogram);		break;
		case 2: 	System.out.println("Toplam �r�n Tutar� :"+1.5*kilogram);		break;
		case 3:	System.out.println("Toplam �r�n Tutar� :"+2.3*kilogram);		break;
		case 4:	System.out.println("Toplam �r�n Tutar� :"+3.1*kilogram);		break;
		case 5:	System.out.println("Toplam �r�n Tutar� :"+2.1*kilogram);		break;
		case 6: 	System.out.println("Toplam �r�n Tutar� :"+1.9*kilogram);		break;
		case 7:	System.out.println("Toplam �r�n Tutar� :"+10*kilogram);		break;
		case 8:	System.out.println("Toplam �r�n Tutar� :"+4.3*kilogram);		break;
		case 9: 	System.out.println("Toplam �r�n Tutar� :"+2.7*kilogram);		break;	
		case 10:	System.out.println("Toplam �r�n Tutar� :"+0.5*kilogram);		break;
		
		default:
			System.out.println("Lutfen Ge�erli bir numara giriniz");
		}
		
		
		
		
		
	}

	private static void Market() {
		// TODO Auto-generated method stub
		
	}

	private static void Sark�teri() {
		// TODO Auto-generated method stub
		
	}

	private static void manav() {
		// TODO Auto-generated method stub
		
	}

}
