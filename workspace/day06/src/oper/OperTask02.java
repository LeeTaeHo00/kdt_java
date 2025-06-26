package oper;

import java.util.Scanner; // 입력 클래스 임포트 및 선언

// 6번 : 삼항 연산자 실습
public class OperTask02 { //클래스 시작

	public static void main(String[] args) { // 메인메소드 시작
		// 두수를 입력받아 비교
		// 크다, 작다, 같다 각각 상황에 맞게 출력되도록 로직 구성
		// 삼항연산자는 중복이 가능하다.

		// 로직구성
		// 입력 클래스 임포트 및 선언
		// 정수형 변수 2개와 문자열 변수 한개 선언
		// 출력[두수를 입력해주세요]
		// 정수형 변수 2개에 입력 메소드 사용
		// 삼항 연산자를 2번 사용하여 같거나 작거나 크거나를 비교해줌
		// 결과 출력
		// 입력 메소드 종료
		Scanner sc = new Scanner(System.in); // 입력 클래스 임포트 및 선언
		
		int number1 = 0, number2 = 0; // 정수형 변수 2개 선언
		String result = ""; // 문자열 변수 선언 및 초기화
		
		System.out.println("두 수를 공백으로 나누어 입력해주세요"); // 출력
		number1 = sc.nextInt(); // 정수형 변수 2개에 입력 메소드 사용
		number2 = sc.nextInt(); // 정수형 변수 2개에 입력 메소드 사용
		sc.nextLine(); // 버퍼 비우기
		
		result = number1 == number2 ? "두 수가 같습니다." : (number1 > number2 ? "number1이 더 큽니다" : "number2가 더 큽니다"); // 삼항연산자로 두수 크기 비교 한번에 두번
		
		System.out.println(result); // 결과 출력
		
		// 2. 한개의 정수를 입력 받아서 짝수인지 아닌지 출력하기
		// 짝수입니다 or 짝수가 아닙니다.
		
		//로직구성
		// 입력 클래스 임포트 및 선언
		// 출력[수를 입력해주세요]
		// 정수형 변수 1개 선언 + 정수형 변수 에 입력 메소드사용
		// 삼항 연산자로 변수에 2를 나눈 나머지 값이 0인지 확인한 값을 출력
		// sc.close

		System.out.println("수를 입력해주세요"); // 출력
		int number3 = sc.nextInt(); // 정수형 변수 1개 선언 + 정수형 변수 에 입력 메소드사용
		sc.nextLine(); // 버퍼 비우기
		
		System.out.println(number3 + "는(은)" + (number3 % 2 == 0 ? "짝수 입니다." : "홀수 입니다.")); // 삼항 연산자로 변수에 2를 나눈 나머지 값이 0인지 확인한 값을 출력
		
		sc.close(); // 입력 메소드 종료
		
		// 로직구성 선생님
		// 정수형 변수 1개, 문자열변수 1개(삼항, 나머지 연산자, 관계 연산자), 입력메소드 사용
		// 출력
		
		
	} //메인메소드 끝

} // 클래스 끝
