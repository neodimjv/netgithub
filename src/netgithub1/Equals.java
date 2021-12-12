package netgithub1;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=a+0;
		System.out.println(a==b);
		System.out.println();
		
		char c='N';
		char d='N'+0;
		System.out.println(c==d);
		
		String e="Ali";
		String f="Can";
		String g="AliCan";
		System.out.println(e+f==g);
		System.out.println(e+f+g);
		System.out.println(g.equals(e+f));
		System.out.println(f.equals(e));
		
		String ad="Neo";
		String soyad="Geo";
		String ad2="neo";
		System.out.println(ad.equalsIgnoreCase(soyad));
		System.out.println(ad.equalsIgnoreCase(ad2));
		
		
		

	}

}
