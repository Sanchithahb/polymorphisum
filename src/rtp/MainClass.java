package rtp;

public class MainClass {
	//R3--upcasting
	static void display(Employee obj) {
		obj.work();
	}
	public static void main(String[] args) {
		//upcasting using diif reference reference variable
		Employee e1 = new Developer();
		e1.work();

		Employee e2 = new Tester();
		e2.work();
		
		System.out.println("---------------");

        //upcasting using single reference variable
		Employee emp;
		emp = new Developer();
		emp.work();

		emp = new Tester();
		emp.work();
		
		System.out.println("------------");
		//generalization one reference store diff obj
		display(new Developer());
		display(new Tester());

	}

}
