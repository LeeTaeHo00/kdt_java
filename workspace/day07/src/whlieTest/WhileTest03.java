package whlieTest;

import java.util.Scanner;

public class WhileTest03 { // 클래스 시작

	public static void main(String[] args) { // 메임 메소드 시작
		// 2개의 정수를 입력받아서 두정수의 합을 출력
		// 0을 입력하면 종료, 1을 입력하면 계속 두 정수를 입력하세요
		// while문 사용
		// 기타제어문(break. continue)
		
		// 1) 정수형 변수 2개 선언(두정수 합 구할 변수, 조건변수), 입력 클래스 import
		// 2) while(true) 를 사용하여 무한 반복
		// 2-1) 중괄호 영역 시작
		
		// 2-1-1) 입력메시지(두개의 정슈를 입력하세요)
		// 2-1-2) 정수형 변수 선언하며 입력메소드 사용하여 입력받는다.
		// 2-1-3) 두 정수 합 구할 변수 덧셈 연산
		// 2-1-4) 두정수의 합 출력
		// 2-1-5) 종료 / 계속 할지 출력 메시지
		// 2-1-6) 위 옵션 입력받기
		
		// 2-1-7) 조건문 시작(입력받은 값이 == 0)		
		// 2-1-7-1) 조건문이 참일경우
		// 2-1-7-1-1) 종료 출력 메시지
		// 2-1-7-1-2) break;		
		// 2-1-7-2) 조건문이 거짓이며 값이 1 일경우
		// 2-1-7-2-1) 계속진행합니다 출력
		// 2-1-7-2-2) continue;
		// 2-1-8) 조건문 끝
		
		// 2-2) 중괄호 영역 끝
		// 3) sc.close()
		Scanner sc = new Scanner(System.in); // 입력 클래스 import
		int result = 0, choice = 0; //정수형 변수 2개 선언(두정수 합 구할 변수, 조건변수)
		
		while(true) // while문 무한 반복
		{
			System.out.println("두 정수를 입력해 주세요"); // 출력
			int num1 = sc.nextInt(); // 변수 선언 및 입력메소드 사용
			int num2 = sc.nextInt(); // 변수 선언 및 입력메소드 사용
			
			result = num1 + num2; // result에 num1과 num2를 더한값 대입
			
			System.out.println(num1 + " + " + num2 + " = " + result); // 결과 출력
			
			System.out.println("1 : 계속, 0 : 종료"); // 출력
			
			choice = sc.nextInt(); // choice에 정수형 입력
			if(choice == 0) // 조건문 시작 choice의 값 비교
			{
				System.out.println("종료합니다."); // 참일 떄 값 출력
				break; // while문 종료
			}
			
			else if(choice == 1) // 조건문 2 choice 값 비교
			{
				System.out.println("계속합니다."); // 조건문2 값이 출력일 떄 출력
				continue; // while 처음으로 돌아감
			}
			
			else // 모든값이 일치 하지 않았을때
			{
				System.out.println("엉뚱한 값을 입력했습니다. 종료합니다.");
				break; // while문 종료
			}
		}
		
		sc.close(); // 입력 종료

	} // 메인 메소드 끝

} // 클래스 끝
