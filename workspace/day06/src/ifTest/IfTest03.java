package ifTest;

public class IfTest03 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		// 양수 음수 0인지 출력
		System.out.println("출력 시작"); // 출력
		
		int num = 10; // 정수형 변수 num 선언 및 초기화
		
		if(num > 0) { // 조건문 1 검사, 조건문 시작
			System.out.println("양수 입니다."); // 실행문 1 출력
		}else if(num <0) { // 조건문 2검사
			System.out.println("음수 입니다."); // 실행문 2 출력
		}else { // 모두 false일 경우 검사
			System.out.println("0 입니다."); // 모든 조건문이 false 일때 실행문 출력
		} // 조건문 끝
		
		if(num > 5) { // 조건문 1 검사, 조건문 시작
			System.out.println("5보다 큽니다."); // 실행문 1 출력
		}else if(num > 3) { // 조건문 2검사
			System.out.println("3보다 큽니다"); // 실행문 2 출력
		}else { // 모두 false일 경우 검사
			System.out.println("작아용" + num); // 모든 조건문이 false 일때 실행문 출력
		} // 조건문 끝
		
		System.out.println("출력 끝"); // 출력

	} // main 메소드 끝

} // 클래스 끝
