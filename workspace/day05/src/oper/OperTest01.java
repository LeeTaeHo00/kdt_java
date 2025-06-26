package oper;
//13번 : 산술 연산자
public class OperTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		int num1 = 10, num2 = 20; // int형 변수 2개 선언과 동시에 초기화
		double num3 = 5.5, num4 = 2.5; // double 형 변수 2개 선언과 동시에 초기화
		
//		System.out.println("=====덧셈======"); // 괄호안 내용 출력
//		System.out.println(num1 + "+" + num2 + " = " + (num1 + num2)); // 괄호안 내용 출력
//		System.out.println(num1 + "+" + num3 + " = " + (num1 + num3)); // 괄호안 내용 출력
//		System.out.println(num3 + "+" + num4 + " = " + (num3 + num4)); // 괄호안 내용 출력
//		
//		System.out.println("\n=====뺄셈======"); // 괄호안 내용 출력
//		System.out.println(num1 + "-" + num2 + " = " + (num1 - num2)); // 괄호안 내용 출력
//		System.out.println(num1 + "-" + num3 + " = " + (num1 - num3)); // 괄호안 내용 출력
//		System.out.println(num3 + "-" + num4 + " = " + (num3 - num4)); // 괄호안 내용 출력
//		
//		System.out.println("\n=====곱셈======"); // 괄호안 내용 출력
//		System.out.println(num1 + "*" + num2 + " = " + (num1 * num2)); // 괄호안 내용 출력
//		System.out.println(num1 + "*" + num3 + " = " + (num1 * num3)); // 괄호안 내용 출력
//		System.out.println(num3 + "*" + num4 + " = " + (num3 * num4)); // 괄호안 내용 출력
//		
//		System.out.println("\n=====나누기======"); // 괄호안 내용 출력
//		System.out.println(num1 + "/" + num2 + " = " + (num1 / num2)); // 괄호안 내용 출력
//		System.out.println(num1 + "/" + num3 + " = " + (num1 / num3)); // 괄호안 내용 출력
//		System.out.println(num3 + "/" + num4 + " = " + (num3 / num4)); // 괄호안 내용 출력
//		
//		System.out.println("\n=====나머지======"); // 괄호안 내용 출력
//		System.out.println(num1 + "%" + num2 + " = " + (num1 % num2)); // 괄호안 내용 출력
//		System.out.println(num1 + "%" + num3 + " = " + (num1 % num3)); // 괄호안 내용 출력
//		System.out.println(num3 + "%" + num4 + " = " + (num3 % num4)); // 괄호안 내용 출력
		
		
		// 복합대입 연산자
		int num = 10; // num이라는 int 형 변수의 10이라는 정수 대입
		System.out.println("num의 값은 : " + num); // 괄호안 내용 출력
		
		num = num + 5; // num 이라는 값에 5라는 정수를 더한 값을 num에 대입하였따.
		System.out.println("num의 값은 : " + num); // 괄호안 내용 출력
		
		num = num + 15; // num 이라는 값에 15라는 정수를 더한 값을 num에 대입하였따.
		System.out.println("num의 값은 : " + num); // 괄호안 내용 출력
		
		num += 5; // num = num + 5; 
		System.out.println("num의 값은 : " + num); // 괄호안 내용 출력

		num -= 2.5;	// 32, 실제 계산 값은 32.5 // 32로 나온 이유는 int 변수에 저장했기 때문
		System.out.println(num); // 괄호안 내용 출력
		
		num *= 2; // num이라는 값에 2를 곱한 값을 num에 대입한다.
		System.out.println(num); // 괄호 안 내용 출력
	}

}
