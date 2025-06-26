package homeWork;

import java.util.Scanner;

public class SingTask01 { 

	public static void main(String[] args) {
		// 로직 구성
		// 1) 입력 메소드 선언, 임포트
		// 2) 변수 3개 선언 후 초기화(사용한돈, 한곡당 금액, 잔돈)
		// 3) 출력[한곡당 금액을 입력해 주세요]
		// 4) 한곡당 금액 변수에 입력 메서드 사용
		// 5) 출력[사용할 금액을 입력해 주세요]
		// 6) 사용한 돈 변수에 입력 메서드 사용
		// 7) 조건문 검사(사용한 돈 >= 한곡당 금액)
		// 7-1) 조건문이 참일경우
		// 7-1-1) 잔돈 변수에 사용한돈에 한곡당 금액을 나눠준 후 나머지 값을 대입
		// 7-1-2) 출력[%d곡을 부를 수 있으며 잔돈은 %d입니다], 사용한돈 / 한곡당금액, 잔돈
		// 7-2) 조건문이 거짓일경우
		// 7-2-1) 출력[%d을 입력했으며 곡당 가격은 %d 로 %d 원이 부족하여 노래를 부를 수 없습니다.], 사용한돈, 한곡당금액, 한곡당금액 - 사용한돈		
		// final)입력 메소드 종료
		
		Scanner sc = new Scanner(System.in);
		int pay = 0, cost = 0, change = 0;
		System.out.println("한 곡당 금액을 입력해 주세요");
		cost = sc.nextInt();
		sc.nextLine();
		
		System.out.println("지불할 금액을 입력해 주세요");
		pay = sc.nextInt();
		sc.nextLine();
		
		if(pay >= cost) 
		{
			change = pay % cost;
			System.out.printf("%d곡을 부를 수 있으며 잔돈은 %d입니다", pay / cost, change);
		}
		
		else 
		{
			System.out.printf("%d을 입력했으며 곡당 가격은 %d 로 %d 원이 부족하여 노래를 부를 수 없습니다.", pay, cost, cost - change);
		}
		
		sc.close();
	}

}
