package edu.java.inner02;

public class InnerMain02 {

	public static void main(String[] args) {
		
		Car car1 = new Car("미니쿠퍼");
		Car.Tire  tire1 = car1.new Tire(20);
		tire1.display();

		System.out.println("----------------");
		Car car2 = new Car("벤츠");
		Car.Tire tire2 = car2.new Tire(30);
		tire2.display();
		
		System.out.println("----------------");
		Car.Tire tire3 = new Car("제네시스").new Tire(19);
	}

}
