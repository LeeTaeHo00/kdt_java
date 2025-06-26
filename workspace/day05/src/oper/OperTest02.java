package oper;

public class OperTest02 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		
		int num = 1;	// num 이라는 정수형 변수 선언 및 초기화
		System.out.println("num의 값 : " + num); // 현재 num 값 확인
		System.out.println("num + 10의 값" + (num + 10)); // num 값에 10을 더한 값 확인, 값이 저장되진 않음, 대입해주지 않았기 때문
		
		System.out.println("\n=====증감연산자(전위형)======"); // 괄호안 값 출력
		System.out.println("기존 num의 값 : " + num ); // 현재 num 값 확인
		System.out.println("전위 증감 연산자를 사용한 num의 값 : " + ++num); // 2 // 전위 계산한 num 값 확인
		System.out.println("현재 num의 값 : " + num); // 전위 계산한 num값 확인
		
		System.out.println("\n=====증감연산자(후위형)======");// 괄호안 값 출력
		int num2 = 1; // num2 이라는 정수형 변수 선언 및 초기화
		
		System.out.println("기존 num2의 값 : " + num2 ); // 현재 num2 값 확인
		System.out.println("후위 증감 연산자를 사용한 num의 값 : " + num++); // 후위 계산한 num2 값 확인
		System.out.println("현재 num2의 값 : " + num2); // 현재 num2 값 확인
		
		System.out.println(); // 줄넘김
		int num3 = 7, num4 = 7; // num3 와 num4라는 정수형 변수 선언 및 초기화
		int result1 = 0, result2 = 0; // result1 와 result2라는 정수형 변수 선언 및 초기화
		
		result1 = --num3 + 4; // num3를 전위 계산한 후 4를 더한 값을 result1 에 대입
		System.out.println(result1); // 전위 계산되어 num3에 --를 한 값을 연산한 값을 출력
		
		result2 = num4++ - 4; // num3를 전위 계산한 후 4를 더한 값을 result1 에 대입
		result2 = num4++; // num4를 후위 계산한 ++ 후 result2 에 대입 이 줄에서는 값이 안바뀜
		
		System.out.println(result2); // 후위 계산된 num4의 바뀌지 않은 값 추력
		System.out.println(num4); // 후위 계산되어 현재 값이 바뀐 num4의 값 출력
		
	} // 메인 메소드 끝

} // 클래스 끝
