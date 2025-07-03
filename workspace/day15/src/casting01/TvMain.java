package casting01;

public class TvMain {
	
	// 각각 클래스 객체
	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv);
		tv.powerOnOff();
		
		SmartTv sTv = new SmartTv();
		System.out.println(sTv);
		sTv.netflix(); // 자식 객체의 값은 자식 클래스에 있는 메버 사용가능
		sTv.chUp(); // 자식 객체의 값은 부모 클래스에 있는 멤버도 사용가능
		
		// Up casting
		// 방법1
		// SmartTv()는 Tv 클래스의 참조 변수 tv1에 할당된다
		// 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 참조값을 대입하는 것이다.
		// 부모 클래스 자료형 참조변수명 대입연산자 new 자식 생성자();
		
		Tv tv1 = (Tv) new SmartTv(); // 부모 타입의 객체에 자식의 참조값을 대입
		System.out.println(tv1);
//		tv1.netflex(); // 업캐스팅되면 자식클래스에 만들어진 멤버는 사용 불가능
		
		// 방법2
		Tv tv2 = (Tv)sTv;
		
		// tv2 는 SmartTv 클래스의 객체를 참조하지만 업캐스팅으로 인해 Tv 타입으로 취급된다.
		// 따라서 Tv 클래스의 필드와 메소드에만 접근할 수 있다.
		
		// 방법3
		Tv tv3 = new SmartTv();
		// 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 객체를 참조한다.
		// 부모 클래스 타입의 참조변수에 자식 클래스타입의 객체의 주소값을 저장한다.
		
		// Down Casting : 반드시 업캐스팅된 값을 사욯한다.
		
		// 잘못된 사용예시
//		SmartTv stv3 = (SmartTv) tv3;
//		stv3.netflix();
//		빨간 밑줄이 나타나지 않고 실행해야 오류가 나는 것을 알 수 있따
//		즉, up casting 된 값을 다시 원래 자식 타입으로 되돌리는 것이 down Casting 이다.
		
		
	}

}
