package review;

import java.util.Scanner;

public class SingTask02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingTask02
//		3) 남은 금액으로 음료 구매 가능 여부 추가 (한곡당 금액 200원, 음료 금액은 100원) 음료는 한잔만
//		4) 총 부른 곡 수에 따른 보너스 곡 지급
		
		// 로직 구성
		//1) 입력클래스 import
		//2) 정수형 상수 2개 선언 및 초기화 (노래가격, 음료가격)
		//3) 정수형 변수 6개 선언 및 초기화 (금액입력, 노래곡수, 잔돈, 음료먹은 노래수, 음료먹은 잔돈, 보너스곡수)
		//4) 출력[금액을 입력해주세요]
		//5) 금액입력 변수에 입력 메소드
		//6) 노래곡수 = 금액 / 노래가격
		//7) 잔돈 = 금액 / 노래가격
		//8) 출력(몇곡 부를수 있으며 잔돈은 얼마입니다.
		//9) 조건문(음료를 위해 한 곡 줄이는 경우) (노래곡수 > 0 && (금액 - ((노래곡수 -1) * 노래가격)) >= 음료금액) )
			//9-1) 음료 금액보다 잔액이 크거나 같을 경우
				//9-1-2음료마실경우 노래곡수 = 노래곡수 - 1;
				//9-1-1) 음료마실경우 잔돈 = 금액 - (음료마실경우 노래곡수 * 노래가격 + 음료가격)
			//9-2) 
		//10) 보너스 곡 제공 (보너스곡 = 노래곡수 / 5)
		//11) 조건문(보넛곡 > 0)
		//11-1) 보너스로 n곡이 추가되어 총 n곡을 부를 수 있습니다.
		//final) sc.close()
		
		final int PRICE = 200, PRICE_DRINK = 100;
		int money = 0, songCount = 0, change = 0;
		int bonusSong = 0, songCountAfterDrink = 0, changeAfterDrink = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액입력");
		money = sc.nextInt();
		songCount = money / PRICE;
		change = money % PRICE;
		
		songCountAfterDrink = songCount - 1;
		changeAfterDrink = money - (songCountAfterDrink * PRICE + PRICE_DRINK);
		
		System.out.printf("%d 곡을 부를 수 있고 잔돈은 %d원 입니다.\n", songCount, change);
		
		if(change >= PRICE_DRINK) 
		{
			if(change - PRICE_DRINK == 0)
			{
				System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있습니다.\n", songCount);
			}
			
			else 
			{
				System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d 원입니다.\n",songCount, change - PRICE_DRINK );
			}
		}
		
		else if(songCount > 0 && (money - songCountAfterDrink * PRICE) >= PRICE_DRINK && change >= PRICE_DRINK) // 한곡을 줄이면 음료를 마실 수 있는지
		{			
			
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를 수 있으며 잔돈은 %d 원입니다.\n",songCountAfterDrink, changeAfterDrink );
		}
		
		bonusSong = songCount / 5;
		if(bonusSong > 0) 
		{
			System.out.printf("보너스 곡은 %d로 총 %d 곡을 부를수 있습니다.", bonusSong, songCount + bonusSong);
		}
		
		sc.close();
		
	}

}
