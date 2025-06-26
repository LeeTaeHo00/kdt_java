package scanner;

import java.util.Scanner; // 입력 클래스 import

// 8번 : 사용자로부터 숫자를 입력받고 10을 더한 값출력하기
public class ScannerTest04 { // 클래스 시작

	public static void main(String[] args) { // Main 메소드 시작
		// TODO Auto-generated method stub
		
		// 1) 입력 클래스 선언
		Scanner sc = new Scanner(System.in); // 입력 클래스 선언
		// 2) 입력 클래스 import
		// 3) 입력 메시지 출력
		System.out.print("숫자를 입력하세요 : "); // 소괄호 안에 내용 출력
		// 4) 문자열 변수 선언, 입력 메소드 사용
		String number = sc.nextLine(); // number라는 String변수에 입력메소드 사용
		// 5) 변수 출력
		System.out.println("입력한 값은 " + number + "입니다."); // 소괄호 안에 내용 출력
		
		// 6) 문자열 값을 정수형 으로 형변환하여 변수 선언
		int result = Integer.parseInt(number); // result라는 정수형 변수에 number라는 문자열을 형변환하여 대입
		
		// 7) 전체 결과 출력
		
		System.out.println("10을 더한 값은" + (result + 10) + "입니다."); // 소괄호 안에 내용 출력
			
	} // Main 메소드 끝

} // 클래스 끝
