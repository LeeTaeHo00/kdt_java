package homework07;

import java.util.Scanner;

public class SingTest {

	public static void main(String[] args) {
//		SingTest
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//
//		입력은 정수로 받되, nextLine()과 Integer.parseInt() 조합을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
		
		
		// 로직 구성
		// 1. 입력 클래스 선언 및 초기화
		// 2. 변수선언 INT[곡가격, 현재돈, 음료수 가격, 음료수를 먹고난 후 돈, 부를 곡수] STRING[대답]
		// 3. 출력[곡당가격 입력]
		// 4. 곡가격에 입력메소드 사용
		// 5. do~while문 시작
		// 		5-1) 출력 [금액입력 0 입력시 종료]
		//		5-1++) 조건문으로 (금액이 0일시 break)
		//		5-2) 현재돈에 입력메소드 사용
		//		5-3) 음료수를 먹고난 돈에 (현재돈 - 음료수가격) 대입
		//		5-4) 출력 [%d 곡을 부를 수 있으며 잔돈은 %d 입니다.]
		//		5-5) 출력 [음료를 마시고 싶으면 %d곡을 부를 수 있으며, 잔돈은 %d 입니다.]
		//		5-6) 출력 [음료수를 마시겠습니까? YES NO]
		//		5-7) 대답에 입력 메소드 사용
		//		5-8) 조건문시작(대답이 YES인경우)
		//		5-9-1) 출력[음료수를 구매하셨습니다.]
		//		5-9-2) 출력[%d 곡을 부를 수 있으며 잔돈은 %d 입니다.]
		//		5-9) elseif 문 시작(대답이 NO인 경우)
		//		5-9-1) 출력[음료수를 구매하지 않았습니다.]
		//		5-9-2) 출력[%d 곡을 부를 수 있으며 잔돈은 %d 입니다.]
		
		Scanner sc = new Scanner(System.in);
		int price = 0, money = 0, moneyAfterDrink = 0, song = 0, songAfterDrink = 0, change = 0, changeAfterDrink = 0, bonusAfterDrink = 0, bonus = 0;
		final int DRINK_PRICE = 100;
		String answer = "";
		
		System.out.println("곡 가격을 입력해 주세요");
		price = sc.nextInt();
		sc.nextLine();
		
		do 
		{
			System.out.println("금액을 입력해 주세요(0 입력시 종료)");
			money = sc.nextInt();
			sc.nextLine();
			
			if(money == 0) {break;}
			else if(money < price) 
			{
				System.out.println("돈이 부족합니다.");
				continue;
			}
			
			moneyAfterDrink = money - DRINK_PRICE;
			
			song = money / price;
			change = money % price;
			bonus = song / 5;
			
			songAfterDrink = moneyAfterDrink / price;
			changeAfterDrink = moneyAfterDrink % price;
			bonusAfterDrink = songAfterDrink / 5;	
			
			System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d 입니다.\n", song + bonus, change );
			
			System.out.println("음료수를 마시고 싶으시다면");
			System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d 입니다.\n", songAfterDrink + bonusAfterDrink, changeAfterDrink);
			
			System.out.println("음료를 마시겠습니까?");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) 
			{
				System.out.println("음료수를 마셨습니다.");
				System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d 입니다.\n", songAfterDrink + bonusAfterDrink, changeAfterDrink);
			}
			
			else if(answer.equals("N")) 
			{
				System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d 입니다.\n", song + bonus, change );
			}
			
			else 
			{
				System.out.println("이상한 값을 입력했습니다. 종료합니다.");
				break;
			}		
		}while(true);
		sc.close();
	}

}
