package rtp;

public class Solution {

	static void display(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	public static void main(String[] args) {
		FoodDeliveryApp f = new Swiggy();
		f.orderFood();
		FoodDeliveryApp f2 = new Zomato();
		f2.orderFood();

		System.out.println("-------------------");

		FoodDeliveryApp obj;
		obj = new Swiggy();
		obj.orderFood();
		obj = new Zomato();
		obj.orderFood();

		System.out.println("-------------------");

		display(new Swiggy());
		display(new Zomato());


	}

}
