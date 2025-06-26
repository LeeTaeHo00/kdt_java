package classBasic2;
// 13번 : 카 메인 메인
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체화(인스턴스화)
		Car myCar = new Car();
		
		myCar.model = "쀡쀡이 Model 3";
		myCar.color = "쀡쀡이";
		myCar.speed = 0;
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상   : " + myCar.color);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.accelerate(120);
		

		myCar.stop();
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.accelerate(20);
		
		myCar.slowSpeed();
		myCar.slowSpeed();
		myCar.slowSpeed();
	}

}
