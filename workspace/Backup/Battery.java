package smartPhone;

import java.util.Scanner;

public class Battery {
	
	int battery;
	
	// 생성자
	public Battery() 
	{
		this.battery = 100;
	}
	
	public Battery(int battery) 
	{
		this.battery = battery;
	}
	
	
	void charge(int power) 
	{
		this.battery += power;
		if(this.battery > 100) 
		{
			this.battery = 100;
		}
	}
	
	void useBattery(int power) 
	{
		this.battery -= power;
		if(this.battery < 0) 
		{
			this.battery = 0;
		}
	}
	
	// 현재 배터리 잔량 표시 메뉴(메뉴용)
	void printCurrentBattery() 
	{
		System.out.printf("=남은 배터리 잔량 :           %3d%c\t=\n",this.battery,'%');
	}
	
	// 메뉴 기능 구현
	void useMenu(Scanner sc) 
	{
		boolean checker = true;
		while(true) 
		{
			printMenu();
			int selectMenu = sc.nextInt();
			sc.nextLine();
			
			switch(selectMenu) 
			{
			
			case 1:
				System.out.println("폰을 충전 했습니다.");
				charge(30);
				break;
			case 2:
				System.out.println("폰을 충전 했습니다.");
				charge(30);
				break;
			case 3:
				System.out.println("메뉴를 나갑니다.");
				checker = false;
				break;
			
			default:
				break;
			}
			
			if(checker == false) break;
			
		}
	}
	
	// 메뉴 출력문
	void printMenu() 
	{
		System.out.println("=================================");
		printCurrentBattery();
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t   1. 충   전\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t   2. 사용가능시간\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t   3. 뒤   로\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=\t\t\t\t=");
		System.out.println("=================================");
	}
	
}
