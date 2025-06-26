package variable;

public class Variable02  // 클래스 시작
{// 클래스 중괄호 영역 시작
	public static void main(String[] args) // main 메소드 시작
	{	// main 메소드 중괄호 시작
		
		int num1 = 10; // 정수형 변수 num1를 선언하고 10이라는 정수향 값을 대입한다.
		int num2 = 20; // 정수형 변수 num2를 선언하고 20이라는 정수향 값을 대입한다.
		int num3 = 30; // 정수형 변수 num3를 선언하고 30이라는 정수향 값을 대입한다.
		
		System.out.println(num1);
		System.out.println(num2);	// num2 변수에 저장된 정수형 값을 출력하고 줄바꿈한다.
		System.out.println(num3);
		System.out.println(num1 + num2 +num3); // 정수형은 덧셈연산결과 확인이 가능하다.
		
		int num4, num5, num6; // num4 5 6 이라는 정수형 변수 선엉ㄴ
		num4 = 1; // 변수 초기화
		num5 = 2;// 변수 초기화
		num6 = 3;// 변수 초기화
		
		int num7 = 1; double num8 = 2, num9 = 3;
		// 정수형 변수 num7에 1이라는 값을 저장,
		// 정수형 변수 num8에 2라는 값을 저장하고,
		// 정수형 변수 num9에 3이라는 값을 저장한다.
		// 여러개의 변수를 선언 시 같은 타입이라면 ","를 이용해서 여러개 선언할 수 있다.
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
		
	}	// main 메소드 중괄호 끝
}// 클래스 중괄호 영역 끝
