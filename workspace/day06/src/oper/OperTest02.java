package oper;

import java.util.Scanner;

public class OperTest02 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// 조건식 ? 참값 : 거짓값;
		// 조건식은 반드시 결과가 boolean 값으로 나와야 한다.
		// 삼항 연산자는 값을 반환하므로 변수에 저장하거나 출력할 수 있따.
		
		System.out.println(true ? "참입니다." : "거짓입니다."); //참일때의 값을 출력
		System.out.println(false ? "참입니다." : "거짓입니다."); //거짓 일때의 값을 출력
		
		System.out.println(10 > 5 ? "10은 5보다 커!." : "10은 5보다 작아!"); // 조건식에 따른 값을 결과에 따라 다르게 출력
		System.out.println(10 > 5 && 20 > 5? "true 입니다." : "false 입니다."); // 조건식에 따른 값을 결과들이 모두 참일 경우 참을 출력
		
		int number = 1 < 2 ? 1 : -1; // 변수를 선언 한 후 1과 2의 크기를 비교하여 결과에 따라 다른 값을 넣어 초기화
		System.out.println(number);
		
		// 정수 2개를 입력받아서 큰 수 구하기
		// 입력클래스 import
		// 입력 메시지 출력
		// 정수형 변수 2개 선언
		// 문자열 변수 1개 선언, 삼항연산자 대입
		// 출력
		// .close
	
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 두 숫자를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		
		String result = num1 <= num2 ? num2 + "가 큽니다" : num2 + "가 작습니다.";
		System.out.println(num1 + "과 " + num2 + "비교 결과는 " + result);
		sc.close();

	} // 메인 메소드 끝

} // 클래스 끝
