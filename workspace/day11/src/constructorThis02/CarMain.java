package constructorThis02;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("차");
		System.out.println(car1);
		car1.printInfo();
		
		Car car2 = new Car("기아");
		System.out.println(car2);
		car2.printInfo();
	}
}


