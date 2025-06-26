package review;

import java.util.Scanner;

// 과제1 : 금액과 곡 당 가격을 입력받아 부를 수 있는 곡 수와 잔돈 계산
public class SingTask01 {// 클래스 시작

	public static void main(String[] args) {// 메인 메소드 시작
		//1) 입력클래스 import
		//2) 정수형 변수 4개 선언
		//3) 입력 메시지 출력
		//4) 변수1 nextInt() 입력받아 저장
		//5) 곡 당 입력 메시지 출력
		//6) 변수2 nextInt() 입력받아 저장
		//7) if ~ else
			//7-1) 넣은 금액 < 곡당 가격
				//7-1-1) 출력[입력한 금액과 부족한 금액]
			//7-2) 조건문가 거짓일 경우
				//7-2-1) 곡수 = 금액 / 가격
				//7-2-2) 잔도 = 금액 % 가격
		//7-2-1) 출력[부를수 있는 곡수와, 잔돈 출력]
		//8) sc.close()

		Scanner sc = new Scanner(System.in);
		int money = 0, price = 0, song = 0, change = 0;
		System.out.println("금액 입력");
		money = sc.nextInt();
		
		System.out.println("곡당 가격 입력");
		price = sc.nextInt();
		
		if(money < price) 
		{
			System.out.printf("입력한 금액은 %d 원 입니다. 한 곡당 가격은 %d원으로 %d원이 부족합니다.", money, price, price - money);
		}
		else 
		{
			song = money / price;
			change = money % price;
			System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d 원 입니다.", song, change);
		}
		
		
		sc.close();
	}

}
