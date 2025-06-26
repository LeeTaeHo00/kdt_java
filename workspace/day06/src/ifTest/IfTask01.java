package ifTest;

import java.util.Scanner;

public class IfTask01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		
		// 로직구성
		// 입력메소드 임포트 선언
		// 출력[숫자를 입력하세요]
		// 변수 선언 및 입력메소드 사용
		// if문으로 조건문 검사 및 출력
		
		// 기본값
		// 정수 0, 실수0.0, 문자형 ' ', 문자열 "" or null, 논리형 false
		
		Scanner sc = new Scanner(System.in); // 입력메소드 임포트 선언
		System.out.println("숫자 입력"); // 출력
		int num = sc.nextInt(); // 정수형 변수 선언 및 정수형 입력메소드 사용
		
		if(num % 2 == 0) { // 조건문 시작 및 검사
			System.out.println("짝수입니다.,"); // 출력
		}else { // 조건문이 false일때 실행문 시작
			System.out.println("홀수입니다."); // 출력
		} // 조건문 끝
		
		sc.close(); // 입력 메소드 끝
		
		System.out.println((num % 2 != 1) ? "짝수" : "홀수"); // 삼항연산자를 사용하여 num이 짝수인지 홀수인지 출력

	} // 메인 메소드 끝

} // 클래스 끝
