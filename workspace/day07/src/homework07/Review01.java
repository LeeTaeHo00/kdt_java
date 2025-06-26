package homework07;

import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
//		1. 한 개의 정수를 입력받아 짝수인지 홀수인지 출력하기(삼항 연산자 이용)
//
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
//
//		3. 나이를 입력받아서 다음 기준으로 출력하기
//			0 ~ 12 : 어린이입니다.
//			13 ~ 19 : 청소년입니다.
//			20 이상 : 성인입니다.
//
//			나이 입력 : 옆에 숫자쓰기
//			현재 나이는 16살이고 청소년 입니다. [출력물]
//
//		4. 세 개의 정수를 입력받아 내림차순으로 정렬하여 출력하기
//			단, 세 개의 정수는 모두 다른 숫자이어야 한다.
//			숫자 3개 입력 : 5 1 9
//			정렬된 숫자 : 9 5 1
//
//		5. 사용자가 문자열을 입력받고 "X" 만 입력했을 경우에만 종료 메시지 출력하고 그 외에는 입력한 문자열을 출력하기
		
		// 로직구성
		// 1. 입력클래스 선언 및 임포트
		// 2. 정수형 변수 5개 선언(1번 2번 number, 3번용 age ,4번용 num1 num2 num3), 문자열 변수 1개 선언[ageInfo]
		// 3. 출력[숫자를 하나 입력해주세요]
		// 4. 입력[number에 입력메소드사용]
		// 5. 출력 ( number % 2 == 0 ? "짝수임" : "홀수임")
		// 6. 조건문 if(number > 0){}
		// 		내용 : 출력 [양수입니다.]
		//	  조건문 elseif(number < 0)
		//		내용 : 출력[음수입니다.]
		//    조건문 else
		//		내용 : 출력[0입니다.]
		
		// 7. 출력 print[나이를 입력하세요]
		// 8. 입력 [age에 입력 메소드 사용]
		// 9. ageInfo 에 대입 [age >= 20 ? "성인입니다" : (age >= 13) ? "청소년입니다." : "성인입니다."]
		// 10. 출력 [현재 나이는 %d 이며 %s 입니다], age, ageInfo
		
		
		Scanner sc = new Scanner(System.in);
		int number = 0, age = 0, num1 = 0, num2 = 0, num3 = 0;
		String userInput = "";
		
		System.out.println("숫자를 입력해주세요");
		number = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("입력한 숫자 %d는 %s 이며 ", number, number % 2 == 0 ? "짝수" : "홀수");
		
		if(number > 0) {System.out.println("양수입니다.");}
		else if(number < 0) {System.out.println("음수입니다.");}
		else {System.out.println("0입니다.");}
		
		System.out.println("나이를 입력해주세요");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("현재 나이는 %d 이며 %s ", age, (age >= 20 ? "성인입니다." : (age >= 13 ? "청소년입니다." : "어린이입니다..")));
		
		System.out.println("숫자 3개를 공백으로 순서대로 모두 다르게 입력해주세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("\n정렬전 결과 : " + num1 + "," + num2 + "," + num3);
		if(num1 < num2) 
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num1 < num3) 
		{
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if(num2 < num3) 
		{
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("\n정렬된 결과 : " + num1 + "," + num2 + "," + num3);
		
		
		do 
		{
			System.out.println("문장을 입력해 주세요 X를 누르면 나가기");
			userInput = sc.nextLine();
			
			if(userInput.equals("X"))
			{
				System.out.println("시스템을 종료합니다.");
				break;
			}
			System.out.println(userInput + " 을 출력했습니다.");
		}while(true);
		
		
		sc.close();
	}

}
