package staticTest;

public class MyClassB {
	public static void main(String[] args) {
		// 1. 인스턴스 변수 출력 => 객체 생성 필수
		MyClassA a = new MyClassA();
		System.out.println(a);
		System.out.println(a.instanceVar);
		a.instanceVar = 10;
		System.out.println(a.instanceVar);
		
		MyClassA aa= new MyClassA();
		System.out.println(aa);
		aa.instanceVar = 10;
		System.out.println(aa.instanceVar);
		
		// 2. 정적변수 출력 => 객체 생성으로 접근할 수 있지만 권장하지 않음
		// 클래스명.정적변수명으로 접근한다!! => 공통된 저장공간을 사용한다.
		MyClassA.staticVar = 100;
		System.out.println(MyClassA.staticVar);
		System.out.println();
		
		// 3. 다른 클래스에서 인스턴스 메소드 호출
		a.instanceMethod1();
		a.instanceVar = 20;
		a.instanceMethod1();
		
		System.out.println();
		
		// 4.다른 클래스에서 스태틱 메소드 호출
		MyClassA.staticMethod1();
		
	}
}
