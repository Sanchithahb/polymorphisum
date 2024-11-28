package rtp;

public class Employee {
	void work() {
		System.out.println("Employee is working");
	}
}

class Developer extends Employee {  //R1--IS-A
	void work() {
		System.out.println("developing app");
	}
}
class Tester extends Employee {
	void work() {  //R2--method overriding
		System.out.println("Testing app");
	}

}


