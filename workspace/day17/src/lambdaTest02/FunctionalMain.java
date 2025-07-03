package lambdaTest02;
// 함수 인터페이스의 객체 람다식으로 만들기
public class FunctionalMain {

	public static void main(String[] args) {
		// 익명클래스로 객체생성
		Func1 fill = new Func1() 
		{
			@Override
			public void addTen(int number) 
			{
				System.out.println("number + 10 = " + (number + 10));
			}
		};
		
		fill.addTen(30);
		
		// 람다식으로 객체 생성
//		1. 이름을 없애고 ()뒤에 -> 붙힌다
//		void(int number) -> {출력메소드}
//		2. 반환 타입 추론 가능하므로 생략한다.
//		(int number) -> {출력메소드}
//		3. 매개변수의 타입 추론 가능하므로 생략가능, 1개일경우 ()도 생략가능
//		타입 생략시 ()를 없앤다.
//		number -> {출력메소드}
//		4. 바디가 1줄이면 중괄호와 ; 생략가능
//		number-> 출력력문
		
		Func1 f1 = number->System.out.println(number + 10);
		System.out.println(f1);
		f1.addTen(10);

	}

}
