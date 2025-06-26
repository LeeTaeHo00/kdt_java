package oper;
// 3번 : 관계연산자와 논리 연산자
public class OperTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		
		System.out.println("===========관계 연산자==========="); // 출력
		int num1 = 10, num2 = 20, num3 = 10; // 정수형 int 변수 3개 선언 후 초기화
		System.out.println(num1 + " > " + num2 +  " : " + (num1 > num2)); // num1과 num2의 크기를 관계연산자>로 비교한 결과를 출력
		System.out.println(num1 + " < " + num2 +  " : " + (num1 < num2)); // num1과 num2의 크기를 관계연산자<로 비교한 결과를 출력
		System.out.println(num1 + " >= " + num2 +  " : " + (num1 >= num2)); // num1과 num2의 크기를 관계연산자>=로 비교한 결과를 출력
		System.out.println(num1 + " <= " + num2 +  " : " + (num1 <= num2)); // num1과 num2의 크기를 관계연산자<=로 비교한 결과를 출력
		System.out.println(num1 + " == " + num2 +  " : " + (num1 == num2)); // num1과 num2의 크기를 관계연산자==로 비교한 결과를 출력
		System.out.println(num1 + " != " + num2 +  " : " + (num1 != num2)); // num1과 num2의 크기를 관계연산자!=로 비교한 결과를 출력
		System.out.println(num1 + " == " + num3 +  " : " + (num1 == num3)); // num1과 num3의 크기를 관계연산자==로 비교한 결과를 출력
		
		System.out.println(10 >= 10); // 10과 10을 >= 로 비교한 값을 출력
		
		System.out.println("==========논리 연산자=========="); // 출력
		System.out.println("and : 둘다 참이면 참(&&)"); // 출력
		System.out.println(true && true);	// 논리연산자and 참참 비교 내용 출력
		System.out.println(true && false); // 논리연산자and 참거짓 비교 내용 출력
		System.out.println(false && false); // 논리연산자and 거짓거짓 비교 내용 출력
		System.out.println(false && true); // 논리연산자and 거짓참 비교 내용 출력
		
		System.out.println("or : 둘중 하나라도 참이면 참 (||)"); // 출력
		System.out.println(true || true);	// 논리연산자or 참참 비교 내용 출력
		System.out.println(true || false); // 논리연산자or 참거짓 비교 내용 출력
		System.out.println(false || false); // 논리연산자or 거짓거짓 비교 내용 출력
		System.out.println(false || true); // 논리연산자or 거짓참 비교 내용 출력
		
		System.out.println("not : 참이면 거짓, 거짓이면 참(!)"); // 출력
		System.out.println(!true);	// 논리연산자not 참 내용 출력
		System.out.println(!false); // 논리연산자not 거짓 내용 출력

		
		
	} // 메인 메소드 끝

} // 클래스 끝
