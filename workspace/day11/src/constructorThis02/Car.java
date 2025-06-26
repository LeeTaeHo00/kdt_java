package constructorThis02;

public class Car {
	// 필드
	String brand;
	int speed;
	
	// 생성자 : alt + shift + s + o
	public Car(String brand) {
		this.brand = brand;
		
		System.out.println("생성자 호출 : " + this);
	}
	
	// 매개변수 타입
	public Car(int speed) {
		this.speed = speed;
	}

	// 매개변수 개수
	public Car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	// 메소드
	void printInfo() 
	{
		System.out.println("모델 : " + this.brand);
		System.out.println("속도 : " + this.speed);
	}
	
}
