package netgithub1;

import java.util.Scanner;

public class Market {

	

	public static void main(String[] args) {
		/*====================PROJEMIZ===================================
			     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler 1 manav, 2
			     * sarkuteri, 3 market secime gor , 4-urunleri listele ve 5-fiyatlari gelsin
			     * 
			     * Basrili Market alýþ-veriþ programý. 1. Adým:
			     * Ürünler ve fiyatlarý içeren listeleri oluþturunuz. No Ürün Fiyat ==== =======
			     * ========= 00 Domates 2.10 TL ,  01 Patates 3.20 TL , 02 Biber 1.50 TL , 03 
			     * Soðan 2.30 TL  ,04 Havuç 3.10 TL   05 Elma 1.20 TL   06 Muz 1.90 TL   07 Çilek 
			     * 6.10 TL    08 Kavun 4.30 TL   09 Üzüm 2.70 TL    10 Limon 0.50 TL
			     * 
			     * 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini isteyiniz. 
			        * 3. Adým: Kaç kg satýn almak istediðini sorunuz.
			          4. Adým: Alýnacak bu ürünü
			     * sepete ekleyiniz ve Sepeti yazdýrýnýz.
			         5. Baþka bir ürün alýp almak
			     * istemediðini sorunuz. 
			         6. Eðer devam etmek istiyorsa yeniden ürün seçme
			     * kýsmýna yönlendiriniz. 
			         7. Eðer bitirmek istiyorsa ödeme kýsmýna geçiniz ve
			     * ödeme sonrasýnda programý bitiriniz
			     */
		
		System.out.println("Lutfen yapmak istediginiz islemi giriniz\n1->Manav\n2->Þarküteri\n3->Market\n4->Ürünleri Listele\n"
                + "5->Fiyatlar");
		 Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        
        
        switch (secim) {
        
        case 1:
            manav();
            break;
        case 2:   
            Sarküteri();
            break;
            
        case 3:
            Market();
            break;
            
        case 4:
            ürünler(); 
            
            break;
            
        case '5':
            fiyatlar();
            break;
        
        default:
            System.out.println("Lutfen gecerli islem seciniz.");
            break;
        }
        
        System.out.println("Baþka bir ürün almak istiyor musunuz?\n"
        		+ "Evet ise 1 e Hayýr ise 2 ye basýnýz");
        Scanner sec = new Scanner(System.in);
        int sayi = sec.nextInt();
        
        if (sayi==1) {
        	ürünler();
			
		} else {
			System.out.println("Ödeme Seçenekleri : \n***Kredi Kartý \n***Banka Kartý \n***Kapýda Ödeme ");

		}

	}

	private static void fiyatlar() {
		// TODO Auto-generated method stub
		
	}

	private static void ürünler() {
		System.out.println("Aþaðýdaki Listeden Ürün Seçiniz");
		 System.out.println("->0 Domates 2.10 TL    ->1 Patates 3.20 TL     ->2 Biber 1.50 TL      ->3 Soðan 2.30 TL\n"
         		+"->4 Havuç 3.10 TL      ->5 Elma 1.20 TL        ->6 Muz 1.90 TL        ->7 Çilek 10 TL    \n->8 Kavun 4.30 TL      ->9 Üzüm 2.70 TL       ->10 Limon 0.50 TL");
		Scanner scan = new Scanner(System.in);
        int ürün = scan.nextInt();
        System.out.println("Kaç kg almak istiyorsunuz");
        Scanner kg = new Scanner(System.in);
		double kilogram=kg.nextDouble();
		
		
		
		
switch(ürün) {
		
		case 0:	System.out.println("Toplam Ürün Tutarý :"+2.1*kilogram);		break;
		case 1:	System.out.println("Toplam Ürün Tutarý :"+3.2*kilogram);		break;
		case 2: 	System.out.println("Toplam Ürün Tutarý :"+1.5*kilogram);		break;
		case 3:	System.out.println("Toplam Ürün Tutarý :"+2.3*kilogram);		break;
		case 4:	System.out.println("Toplam Ürün Tutarý :"+3.1*kilogram);		break;
		case 5:	System.out.println("Toplam Ürün Tutarý :"+2.1*kilogram);		break;
		case 6: 	System.out.println("Toplam Ürün Tutarý :"+1.9*kilogram);		break;
		case 7:	System.out.println("Toplam Ürün Tutarý :"+10*kilogram);		break;
		case 8:	System.out.println("Toplam Ürün Tutarý :"+4.3*kilogram);		break;
		case 9: 	System.out.println("Toplam Ürün Tutarý :"+2.7*kilogram);		break;	
		case 10:	System.out.println("Toplam Ürün Tutarý :"+0.5*kilogram);		break;
		
		default:
			System.out.println("Lutfen Geçerli bir numara giriniz");
		}
		
		
		
		
		
	}

	private static void Market() {
		// TODO Auto-generated method stub
		
	}

	private static void Sarküteri() {
		// TODO Auto-generated method stub
		
	}

	private static void manav() {
		// TODO Auto-generated method stub
		
	}

}
