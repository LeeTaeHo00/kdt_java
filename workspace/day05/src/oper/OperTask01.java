package oper;

import java.util.Scanner; // 입력 클래스 임포트

// 13 : 산술연산자 응용
public class OperTask01 { // 클래스 시작

	public static void main(String[] args) { // 메인메소드 시작
		// 코인노래방 프로그램
		// 사용자에게 금액을 입력받고 부를 수 있는 곡수를 출력한다. 잔돈도 출력한다.
		// 금액 입력 : 
		// [출력]
		// 3곡을 부를 수 있으며 잔돈은 100원 입니다.
		// 한곡당 300원
		
		// 로직 구성
		// 1. 입력 클래스 임포트, 입력 클래스 선언
		Scanner sc = new Scanner(System.in); // 입력 클래스 선언 후 초기화
		
		// 2. 지불할 금액을 담을 정수형 변수 int money를 선언 후 0으로 초기화,
		int money = 0, songPrice = 300; // 정수형 변수 money를 선언하고 0으로 초기화
		
		// 3. 출력[현재 가지고 있는 돈을 입력해주세요]한다.
		System.out.println("가지고 있는 돈을 입력해주세요"); // 괄호 안에 있는 내용 출력
		
		// 4. nextInt()로 Money에 현재 돈을 입력받는다.
		money = sc.nextInt(); // money에 정수값을 nextInt()로 입력받는다.
		
		// 5. 출력 [현재 가지고 있는 돈으로는 %d 곡을 부를수 있으며 %d 만큼의 잔돈이 남았습니다., money / 300, money % 300]
		System.out.printf("현재 가지고 있는 돈으로는 %d 곡을 부를 수 있으며 %d 만큼의 잔돈이 남았습니다.", money / songPrice, money % songPrice); // 괄호 안에 내용 출력
		
		// 6. 입력 클래스 종료 .close()
		
		
		// 선생님 로직 구성
		// 1. 입력 클래스 임포트
		// 2. 금액을 입력하세요 메시지 출력
		// 3. 정수형 변수1 = 입력 메소드(nextInt())\
		// 4. 300이라는 정수를 가지는 상수명 선언
		// 5. 정수형 변수2 = 변수1 / 상수명;
		// 6. 정수형 변수3 = 변수1 % 상수명
		// 7. 출력
		// 8. 스캐너 해제
		
		System.out.println("금액을 입력하세요"); // 금액을 입력하세요 메시지 출력
		int money2 = sc.nextInt(); // 정수형 변수1 = 입력 메소드(nextInt()) 으로 정수형 변수 선언 및 초기화
//		System.out.println(money2);
		final int PRICE = 300; // 300이라는 정수를 가지는 상수명 선언
		int song = money / PRICE; // 노래를 부를 수 있는 수를 현재 돈과 가격을 나눠서 구한다.
		int change = money % PRICE; // 노래를 부르고 남은 돈을 현재 돈과 가격을 나눈 나머지로 구한다.
		System.out.println(song + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다."); // 괄호안 내용 출력
		
		sc.close(); // 입력 클래스 종료

	} // 메인메소드 끝

} // 클래스 끝
