package accessModifier04;

public class SuperCar extends Car {

	@Override
	void speedUp() {
		this.setSpeed(getSpeed() + 20); // private 변수들은 항상 게세터로 접근한다.
		System.out.println("슈빠카가 가속 : " + getSpeed());
	}
	
}
