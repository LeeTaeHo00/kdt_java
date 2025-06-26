package whlieTest;

import java.util.Scanner;

//11번 : do ~ while 문
public class DoWhileTest { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
//		int i = 10; // 조건변수 선언
//		
//		while(i <= 3) // while문 시작(조건식 검사)
//		{
//			System.out.println("i의 값 : " + i); // i값 출력
//			i++; // i 증가
//		}
//		
//		do // do~while 시작 (실행문 무조건 실행)
//		{
//			System.out.println("i의 값 : " + i); // i 값 출력
//			i++; // i 증가
//		}while(i <= 3); // dowhile 문 조건식
		
		// 사용자가 100 보다 큰 수를 입력할 때까지 반복
		Scanner sc = new Scanner(System.in); // 입력클래스 선언 및 임포트
		int num; // 정수형 변수 선언 (초기화 안함)
		
		do // do~while 문 시작
		{
			System.out.println("100 보다 큰 수를 입력해야 반복문 탈출합니다."); // 
			System.out.println("숫자를 입력하세요 : ");
			num = sc.nextInt();
			System.out.println("입력한 수는 " + num + "입니다");
		}while(num <= 100);
		
	} // 메인메소드 끝

} // 클래스끝
