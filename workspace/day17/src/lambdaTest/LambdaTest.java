package lambdaTest;
// 6번 : 람다식 만드는 방법
public class LambdaTest {
	void printHellow()
	{
		System.out.println("안녕하세요");
	}
	
	// 매개변수 x 리턴값 x 출력문 1개	 
//	void printHellow() { System.out.println("안녕하세요");}
	
	// 1. 이름을 없애고 () 뒤에 -> 를 붙인다.
//	void ()->{System.out.println("안녕하세요");}
	
	// 2. 반환타임은 추론 가능하므로 생략한다
//	() -> {System.out.println("안녕하세요");}
	
	// 3. 명령문 1줄이면 중괄호와 세미콜론 생략 가능
//	() -> System.out.println("안녕하세요")
	
	int addTen(int number) 
	{
		return number + 10;
	}
	
	// 매개 변수1개, 리턴값 o 명령줄 1줄
//	int addTen(int number) { return number + 10; }
	
//	1. 이름 없애고 -> 추가
//	int (int number) -> { return number + 10; }
	
//	2. 반환타입은 추론 가능하니 생략
//	(int number) -> { return number + 10; }
	
//	3. 매개변수 타입은 추론이 가능하므로 생략가능하다.(선택)
//	(number) -> { return number + 10; }
	
//	4. 매개변수가 한개라면 () 생략가능(선택)
//	단, 자료형을 생략하지 않았다면 () 생략 불가능
//	number -> { return number + 10; }
	
//	5. 명령문 1줄이면 중괄호와 세미클론 생략 가능
//	단, 중괄호와 세미콜론을 생략하면  return 도 생략해야한다.
//	바디의 결과가 값이라면 자동으로 return 된다.
//	단, 바디의 명령문이 1개이어야 한다.
//	number ->  return number + 10; 
	
	
	
}
