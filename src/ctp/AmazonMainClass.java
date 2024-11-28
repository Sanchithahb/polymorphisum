package ctp;

public class AmazonMainClass {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.buy("phone");
		a.buy(20000);
		a.buy("mobile",2929);
		a.buy(234,"laptop");

	}

}

