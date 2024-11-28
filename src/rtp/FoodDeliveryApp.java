package rtp;

public class FoodDeliveryApp {
	void orderFood() {
		System.out.println("ordering food");
	}

}
class Swiggy extends FoodDeliveryApp{ //IS-A
	@Override
	void orderFood() {
		System.out.println("ordering pizza from swiggy");
	}
}
class Zomato extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("ordering burger from zomato");
	}
}