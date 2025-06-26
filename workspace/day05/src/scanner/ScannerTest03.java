package scanner;

import java.util.Scanner; // 입력 클래스 임포트

// 7번 : 입력 클래스, 입력 메소드 연습
public class ScannerTest03 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		
		// 1. 사용자로부터 입력받아 주소를 출력하기
		// 1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in); // 입력 클래스 선언
		// 2) 입력 클래스 임포트(import)
		// 3) 문자열 변수 선언
		String address; //  문자열 변수 선언
		
		// +) 출력 메시지
		System.out.println("주소를 입력해주세요"); // 소괄호 안에 있는 내용 출력
		
		// 4) 입력 메소드 사용
		address = sc.nextLine(); //입력 메소드 사용 Line
		// 5) 결과를 출력
		
		System.out.println("주소는 " + address + " 입니다."); // address 와 함계 문자열 출력
		System.out.printf("주소는 %s 입니다.", address); // 서식지정자를 사용하여 콘솔에 출력
		
		// 6) 입력 클래스 해제
		sc.close(); // Scanner 객체를 종료하고 내부에서 사용한 자원 (메모리, 스트림 등)을 해제함

	} // main 메소드 끝

} // 클래스 끝
