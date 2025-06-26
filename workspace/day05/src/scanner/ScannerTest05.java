package scanner;

import java.util.Scanner; // 입력 클래스 임포트

// 12번 : nextLine(), next(), nextInt(), nextDouble()
public class ScannerTest05 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		// 입력클래스 import
		Scanner sc = new Scanner(System.in); // 입력 메소드 선언
		
		// 문자열 젠체 입력
		System.out.println("한 줄 전체 입력 : "); // 괄호안 출력
		String line = sc.nextLine(); // nextline메소드로 입력 받기
		
		// 단어 하나 입력
		System.out.println("한 단어 입력");// 괄호안 출력
		String word = sc.next(); // next메소드로 입력 받기
		
		// 정수 입력 (.nextInt())
		System.out.println("정수 입력 : ");// 괄호안 출력
		int number = sc.nextInt(); // nextInt메소드로 입력 받기
		
		// 실수 입력 (.nextDouble())
		System.out.println("정수 입력 : ");// 괄호안 출력
		double number2 = sc.nextDouble(); // nextDouble메소드로 입력 받기
		
		System.out.println("== 결과 출력==");// 괄호안 출력
		System.out.println("nextLine()으로 입력받은 값 : " + line);// 괄호안 출력
		System.out.println("next()으로 입력받은 값 : " + word);// 괄호안 출력
		System.out.println("nextInt()으로 입력받은 값: " + number);// 괄호안 출력
		System.out.println("nextDouble()으로 입력받은 값 : " + number2);// 괄호안 출력
		
		sc.close(); // 입력 종료 // 모든 입력 버퍼 초기화
		

	} // main 메소드 끝

} // 클래스 끝
