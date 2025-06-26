package oper;

import java.util.Scanner;

// 4번 : ~논리연산자까지 복습문제
public class OperTask01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		
		//사용자가 입력한 값 2개 값을 서로 비교하기
		// nextInt() 사용, 변수를 먼저 만들고 진행
		// 변수 만들 때 의미있는 문자로 사용
		// 로직 구성 부터
		
		// 로직구성
		// 1. 입력 클래스 선언 및 임포트
		// 2. 정수형 변수 2개 선언 (firstNum, secondNum)
		// 3. 출력["첫번째 숫자를 입력해주세요"]
		// 4. firstNum 입력 메소드 사용
		// 5. 출력["두번쨰 숫자를 입력해주세요"]
		// 6. secondNum  입력 메소드 사용
		// 7. 입력 받은 두 숫자를 비교하는 출력문 작성
		// 8. 입력문 사용 종료
		
		Scanner sc = new Scanner(System.in); // 입력 메소드 선언 및 임포트
		int firstNum = 0,  secondNum = 0; // 정수형 변수 2개 선언 (firstNum, secondNum)
		
		System.out.println("첫번째 숫자를 입력해주세요"); // 출력
		firstNum = sc.nextInt(); // firstNum 입력 메소드 사용
		sc.nextLine(); // 남아있는 버퍼 제거

		System.out.println("두번째 숫자를 입력해주세요"); // 출력
		secondNum = sc.nextInt(); // secondNum  입력 메소드 사용
		sc.nextLine(); // 남아있는 버퍼 제거
		
		System.out.printf("첫번쨰 숫자 : %d\t두번째 숫자 : %d\n", firstNum, secondNum); // 입력 받은 두 숫자를 비교하는 출력문 작성
		System.out.printf("초과 미만 비교 : %d > %d = %s\n", firstNum, secondNum, firstNum > secondNum); // 입력 받은 두 숫자를 비교하는 출력문 작성
		System.out.printf("이상 이하 비교 : %d >= %d = %s\n", firstNum, secondNum, firstNum >= secondNum); // 입력 받은 두 숫자를 비교하는 출력문 작성
		System.out.printf("같다 다르다 비교 : %d == %d = %s\n", firstNum, secondNum, firstNum == secondNum); // 입력 받은 두 숫자를 비교하는 출력문 작성
		System.out.printf("같다 다르다 비교 : %d == %d && %d != %d => %s\n", firstNum, secondNum, firstNum, secondNum, (firstNum == secondNum && firstNum != secondNum)); 
		// 입력 받은 두 숫자를 비교하는 출력문 작성
		
		// 실수 관계연산자 사용
		double num3, num4; // 실수형 변수 2개 선언
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : "); // 출력
		num3 = sc.nextDouble(); // 입력메소드 사용 여기서 공백을 입력하여 밑에 까지 값 전달
		num4 = sc.nextDouble(); // 위에서 전달된 값 대입
		sc.nextLine();
		
		System.out.println(num3 + ">" + num4 + " : " + (num3 > num4)); // 위에서 선언한 실수형 변수 2개의 크기를 비교한 값을 출력
		
		sc.close(); // 입력문 사용 종료
	} // 메인 메소드 끝
	// 0E-11 소수점 아래 11자리
	// 0E-22 소수점 아래 22자리
} // 클래스 끝
