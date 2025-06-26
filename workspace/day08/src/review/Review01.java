package review;

import java.util.Scanner;
// 복습 1번
public class Review01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// All) 입력 클래스 선언
		Scanner sc = new Scanner(System.in);
		
		
		// 1.개의 정수를 입력받아 짝수 홀수 출력(삼항연산)
		// 로직
		// 1) 입력 메시지 출력
		System.out.println("정수 1개를 입력하세요");
		
		// 2) 정수형 변수 선언 후 nextLine()인 문자열로 입력받아 형변환 후 대입
		int num = Integer.parseInt(sc.nextLine());
		
		// 3) 출력 삼항 연산자 이용
		System.out.println(num + "는 " + (num % 2 == 0 ? "짝수 입니다." : "홀수 입니다."));
		
		// 2. 한개의 정수를 입력받아 양수인지 음수인지 0인지 확인하기
		// 로직
		// 1) 출력 
		System.out.println("한개의 정수를 입력하세요");
		// 2) 입력 메시지 출력
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 3) 조건문 (if elseif else)
		//		3-1	(변수 > 0) {양수출력}
		if(num2 > 0) {System.out.println("양수");}
		//		3-2	(변수 == 0) { 0 출력 }
		else if(num2 == 0) {System.out.println("0");}
		//		3-3	 else		{ 음수 }
		else{System.out.println("음수");}

		// 3. 나이를 입력받아 다음 기준으로 출력하기
		// 1) 입력 메시지 출력
		System.out.println("나이를 입력하세요");
		// 2) 나이변수 입력메소드 nextInt()
		int age = sc.nextInt();
		sc.nextLine();
		// 3) 조건문 (if~else if~else)
		// 3-1) if( 나이 <= 12) { 어린이 출력 }
		if(age <= 12) {System.out.println("어린입니다.");}
		// 3-2) else if(나이 <= 19) { 청소년 출력 }
		else if(age <= 19) {System.out.println("청소년 입니다.");}
		// 3-3) else { 어른 출력 }
		else {System.out.println("어른 입니다.");}
		
		// 4. 나이가 0보다 작거나 같게 입력받으면 다시 입력 받도록
		while(true) 
		{			
			// 1) 입력 메시지 출력
			System.out.println("나이를 입력하세요");
			
			// 2) 나이변수 입력메소드 nextInt()
			int age2 = sc.nextInt();
			sc.nextLine();
			
			// +) 잘못된 입력이었을 경우 다시 입력
			if(age2 <= 0) {continue;}
			
			// 3) 조건문 (if~else if~else)
			// 3-1) if( 나이 <= 12) { 어린이 출력 }
			if(age2 <= 12) {System.out.println("어린입니다.");}
			// 3-2) else if(나이 <= 19) { 청소년 출력 }
			else if(age2 <= 19) {System.out.println("청소년 입니다.");}
			// 3-3) else { 어른 출력 }
			else {System.out.println("어른 입니다.");}	
			
			// 출력후 반복 종료
			break;
		}
		
		// 내림차순 정렬
		// 로직구성
		// 1) 정수형 변수 3개 입력받도록 출력메시지와 변수선언 및 입력받기
		System.out.println("정수 3개 입력");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt(); 
		int number3 = sc.nextInt();
		sc.nextLine(); // 버퍼 정리
		
		// 2) 중복된 숫자일 경우 중복된 숫자는 안됩니다.
		if(number1 == number2 || number2 == number3 || number1 == number3) 
		{
			System.out.println("중복된 숫자는 안됩니다.");
		}
		else 
		{
			int first = 0, second = 0, third = 0;
			

			// 3) 모든 경우를 비교하여 내림차순으로 정렬
			// 3-1) 1이 제일 클경우
			if(number1 > number2 && number1 > number3) 
			{
				first = number1; // 가장 큰 수에 number1을 넣음
				if(number2 > number3) // 그 다음 큰 수를 비교
				{
					second = number2;
					third = number3;
				}
				
				else // 그 다음 큰 수를 비교
				{
					second = number3;
					third = number2;
				}
			}
			
			// 3-2) 2가 제일 클경우
			else if(number2 > number1 && number2 > number3) 
			{
				first = number2;
				if(number1 > number3) 
				{
					second = number1;
					third = number3;
				}
				
				else 
				{
					second = number3;
					third = number1;
				}
			}
			
			// 3-3) 3가 제일 클경우
			else
			{
				first = number3;
				if(number2 > number1) 
				{
					second = number2;
					third = number1;
				}
				
				else 
				{
					second = number1;
					third = number2;
				}
			} // if~else if~else 의 else문의 끝
			
			// 최종 출력
			System.out.println("정렬된 숫자 : " + first + " " + second + " " + third);
			
		} // 첫번째 else 문 중괄 호 닫힌 부분
		
		// 5. 사용자가 문자열을 입력받고 "X" 만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		// 로직구성
		// 1) while문 시작 while(true)
		// 1-1) 입력 메시지 출력
		// 1-2) 변수 와 입력메소드 사용
		// 1-3) 조건문(입력받은 문자열이 X일 때 참)
		// 1-3-1)	종료
		// 1-3-2)	break;
		// 1-4) 조건문else(그 이외 일때)
		// 1-4-1) 입려된 문자열 출력
		// 1-4-2) continue.
		// 1-5) while문 끝
		
		while(true) 
		{
			System.out.println("문자열을 입력하세요 (X입력시 종료) : ");
			String str1 = sc.nextLine();
			
//			/if(str1.equals("X") || str1.equals("x") || str1.equals("종료")) {
			if(str1.charAt(0) == 'X' && str1.length() == 1) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("입력한 문자열 : " + str1);
			}
		}
		
	} // 메인메소드 끝

} // 클래스 끝
