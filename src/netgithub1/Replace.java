package netgithub1;

public class Replace {

	public static void main(String[] args) {
		String cumle="Biz g�zel bir Aileyiz";
		System.out.println(cumle);
		System.out.println();
		System.out.println(cumle.replace("i", "xxx"));
		System.out.println(cumle.replaceAll(cumle, "hayat �ok g�zel"));

	}

}
