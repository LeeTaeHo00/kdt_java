package machines;

import java.util.Scanner;
import character.Character;

import rpg.SystemClass;

public class AtmMachine implements MachineBaseFunc{
	// 메소드
	private Character curHero;
	
	// 생성자	
	public AtmMachine() {
		this.curHero = null;
	}
	
	// getter setter

	public void setCurHero(Character curHero) {
		this.curHero = curHero;
	}


	// 오버라이드
	@Override
	public void printInfo() {
		System.out.println("현재 돈은 " + curHero.getMoney() + "원 입니다");
		System.out.println("계좌 돈은 " + curHero.getAcount().getMoney() + "원 입니다");
	}


	@Override
	public void useMenu(Scanner sc)
	{
		int choose = 0;
		while(choose != 4) 
		{
			SystemClass.menu("입금", "출금", "정보 출력","종료");
			choose = SystemClass.returnInt(sc);
			
			switch(choose) 
			{
			case 1:
				System.out.println("입금할 돈을 입력해 주세요");
				choose = SystemClass.returnInt(sc);
				if(choose > curHero.getMoney()) 
				{
					System.out.println("돈이 부족합니다");
					break;
				}
				curHero.getAcount().setMoney(curHero.getAcount().getMoney() + choose);
				curHero.setMoney(curHero.getMoney() - choose);
				System.out.println(choose + "원이 입금 되었습니다");
				printInfo();
				break;
			case 2:
				System.out.println("출금할 돈을 입력해 주세요");
				choose = SystemClass.returnInt(sc);
				if(choose > curHero.getAcount().getMoney()) 
				{
					System.out.println("돈이 부족합니다");
					break;
				}
				curHero.getAcount().setMoney(curHero.getAcount().getMoney() - choose);
				curHero.setMoney(curHero.getMoney() + choose);
				System.out.println(choose + "원이 출금 되었습니다");
				printInfo();
				break;
			case 3:
				printInfo();
				break;
			}
			
		}
		
	}
}
