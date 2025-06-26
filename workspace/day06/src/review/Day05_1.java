package review;

import java.util.Scanner; // 입력 클래스 import

public class Day05_1 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		/*
		지불금액을 입력ㅂ다아 거스름돈을 출력하기
		단 거스름 돈을 1000원, 500원, 100원 짜리로 나누어 표시하세요.
		클래스명 : Day05_1
		입출력예시]
		물건값 : 2700
		지불금액 : 5000
		거스름돈은 2300 원입니다.
		1000원 : 2개
		500원 : 0개
		100원 : 3개
		*/
		// 로직 구성
		// 입력 클래스 import
		// 2) 출력메시지
		// 3) 정수형 변수1 입력메소드(next())
		// 4) 출력메시지
		// 5) 정수형 변수2 입력메소드(next())
		// 6) 정수형 변수3 = 변수2 - 변수1(산술연산자)
		// 7) 출력(거스름돈은 00원 입니다.)
		// 8) 출력(변수3 / 1000)
		// 9) 출력((변수3 % 1000) / 500)
		// 10) 출력(((변수3 % 1000) % 500) / 100)
		
		// 방법2 8번부터
		// 8) 정수형 변수 선언 = 변수3 / 1000
		// 9) 변수3 %= 1000;
		// 10) 정수형 변수 선언 = 변수3 / 500
		// 11) 변수 3 %= 500;
		// 12) 정수형 변수 선언 = 변수3 / 100
		// 13) 변수 3 = 변수 2 - 변수 1
		
		Scanner sc = new Scanner(System.in); //입력 클래스 선언
		System.out.println("물건값 입력 : ");
		int price = Integer.parseInt(sc.next());
		
		System.out.println("지불 금액 : ");
		int paid = Integer.parseInt(sc.next());
		
		int change = paid - price;
		System.out.println("거스름돈은 " + change + "원 입니다. ");
		
		int thousand = change / 1000;
		change %= 1000;
		
		int fiveHundred = change / 500;
		change %= 500;
		
		int hundred = change / 100;
		
		System.out.println("1000원 : " + thousand + "개");
		System.out.println("500원 : " + fiveHundred + "개");
		System.out.println("100원 : " + hundred + "개");
		
		sc.close();// 메모리해제

	} // main 메소드 끝

} // 클래스 끝
