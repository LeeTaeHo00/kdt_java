package staticTest;

public class MyClassA {
	// 필드(인스턴스 변수, 스태틱 변수, 상수)
	// 인스턴스 변수
	int instanceVar;
	
	// 스태틱 변수
	static int staticVar;
	
	// 생성자 => 컴파일러가 기본생성자를 만든다.
	
	// 메소드(인스터스 메소드, 스태틱 메소드)
	// 인스턴스 메소드1
	void instanceMethod1() 
	{
		System.out.println("인스턴스 메소드`1 호출되었습니다.");
		instanceVar = instanceVar;
		System.out.println("인스턴스 메소드1에서의 인스턴스 변수값 : " + this.instanceVar);
		staticVar = 100;
		System.out.println("인스턴스 메소드1에서의 스태틱 변수값 : " + staticVar);
		instanceMethod2();
		staticMethod1();
	}
	
	
	// 인스턴스 메소드2
	void instanceMethod2() 
	{
		System.out.println("인스턴스 메소드`2 호출되었습니다.");
	}
	
	// 스태틱 메소드1
	static void staticMethod1() 
	{
		System.out.println("스태틱 메소드`1 호출되었습니다."); // 인스턴스 메소드는 스태틱 영역에서 호출 불가
//		instanceVar = 1000; // 인스턴스 필드는 스태틱 영역에서 접근 불가
		staticVar = 1000;
		System.out.println("스태틱 메소드1에서 스태틱 변수값 : " + staticVar);
	}
	
	// 스태틱 메소드2
	static void staticMethod2() 
	{
		System.out.println("스태틱 메소드`2 호출되었습니다.");
	}
	
}
