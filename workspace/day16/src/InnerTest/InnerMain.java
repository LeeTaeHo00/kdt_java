package InnerTest;

//25번 : 내부클래스와 외부클래스의 객체화
public class InnerMain {
	public static void main(String[] args) {
		// 외부 클래스 객체 생성
		Outer outer = new Outer();
		
		System.out.println("외부 클래스의 참조값 : " + outer);
		System.out.println("외부 클래스의 데이터값 : " + outer.var1);
//		System.out.println("외부 클래스의 데이터값 : " + outer.var2); 외부 클래스의 객체로는 내부 클래스 멤버에 접근 불가
		
		// 내부 클래스의 객체 생성, 내부 클래스는 스스로 객체를 생성할 수 없다
		// 내부 클래스는 외부 클래스의 인스턴스(객체)를 통해 생성해야 한다.
//		Inner inner = new Inner(); 바로 생성은 불가능
		// 로그에서 $는 내부클래스를 의미
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner);
		
		
	}
}
