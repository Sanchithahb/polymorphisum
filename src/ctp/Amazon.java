package ctp;

public class Amazon {
	void buy(String product) {
		System.out.println("product:"+product);
	}
	void buy(int cost) {
		System.out.println("cost:"+cost);
	}
	void buy(String product,int cost) {
		System.out.println("product:"+product+"  cost:"+cost);
	}
	void buy(int cost,String product) {
		System.out.println("cost:"+cost+" product:"+product);
	}

}
