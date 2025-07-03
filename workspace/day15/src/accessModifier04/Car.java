package accessModifier04;

public class Car {
	// final : 상수(최종값)
	// final 변수(상수) : 값 변경 불가
	// final 클래스 : 최종적인 클래스 => 더 이상 상속 불가(자식클래스 만들 수 없다)
	// final 메소드 : 최종적이 메소드 => 오버라이딩 불가
	
	// 필드
	private int speed;

	// 메소드
	void speedUp() 
	{
		speed += 10;
		System.out.println("현재 시속 : " + this.speed);
	}
	
	// final 메소드 : 오버라이딩 불가능
	final void stop() 
	{
		System.out.println("브레이크 밟았따");
		this.speed = 0;
	}
	
	// 생성자
	
	// getter setter
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
