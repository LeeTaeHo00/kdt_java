package homework07;

import java.util.Scanner;

public class ATMTest {

	public static void main(String[] args) {
//		AtmTest
//		6. ATM 메뉴에서 입금, 출금, 잔액조회를 구현하기
//			[조건]
//			초기 잔액은 10000원으로 설정
//			메뉴 선택에 따라 작업 수행
//			종료시 프로그램 종료
//			숫자(번호)로 입력받기
//			String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : "
//				+ "\n1. 잔액조회 "
//				+ "\n2. 입금 "
//				+ "\n3. 출급 " 
//				+ "\n4. 종료 "
//				+ "\n선택 : ";
//			그 외의 번호 입력시 다시 선택하세요 출력 후 메뉴 보이기
//
//			번호 입력시 해당 메시지만 출력하고 종료
		
		// 로직구성
		// 1. 입력 클래스 선언 및 임포트
		// 2. 변수선언 [잔액, 메뉴], 문자열 [msg]
		// 3. do - while 문 선언
		// 		출력[msg]
		//		메뉴선택 에 입력 메소드 사용
		// 		결과에 따른 출력실행
		//    do while(true) // 무한반복
		// 4. sc.close()
		
		Scanner sc = new Scanner(System.in);
		int money = 10000, menuInput = 0;
		String msg = "\nATM 기기의 메뉴 중 번호를 선택하세요 : "
				+ "\n1. 잔액조회 "
				+ "\n2. 입금 "
				+ "\n3. 출급 " 
				+ "\n4. 종료 "
				+ "\n선택 : ";
		
		do 
		{
			System.out.println(msg);
			menuInput = sc.nextInt();
			sc.nextLine();
			
			switch(menuInput) 
			{
			case 1:
				System.out.println(money + "원이 있습니다.");
				break;
			case 2:
				System.out.println(money + "을 입금합니다.");
				money += money;
				break;
			case 3:
				System.out.println(money + "을 출금합니다.");
				money -= money;
				break;
			case 4:
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
			
		}while(menuInput != 4);
		
		sc.close();
	}

}
