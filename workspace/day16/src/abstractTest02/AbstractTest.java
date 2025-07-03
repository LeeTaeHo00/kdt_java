package abstractTest02;

public class AbstractTest {
	public static void main(String[] args) {
		// 일반 클래스 객체화
		ClassA a = new ClassA();
		a.method1();
		System.out.println(a);
		
		// 추강클래스 객체화
//		ClassB b = new ClassB();
		
		// 추상클래스를 상속받은 클래스 객체화
		ClassC c = new ClassC();
		System.out.println(c);
		c.method1();
		c.method2();
		
		ClassB b = new ClassC();
		System.out.println(b);
		b.method1();
		
		// 다운 캐스팅
		((ClassC)b).printNumber();
		
	}
}
