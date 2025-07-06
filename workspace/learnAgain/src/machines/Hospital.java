package machines;

import java.util.Scanner;
import character.Character;
import character.ItemInfo;
import character.ItemType;
import character.SkillType;
import rpg.SystemClass;

public class Hospital implements MachineBaseFunc {

	// 필드
	final int HEAL_PRICE = 500;
	final int POTION_PRICE = 300;
	Character curHero;
	ItemInfo potion = new ItemInfo("빨강표션", ItemType.POTION, 300, 50);

	// 생성자
	public Hospital() 
	{
		curHero = new Character() {
			
			@Override
			public void levelUp() {
				// TODO Auto-generated method stub
				System.out.println("공백입니다.");
			}
			
			@Override
			public void baseAtk(Character target) {
				// TODO Auto-generated method stub
				System.out.println("공백입니다.");
			}
		};
	}
	
	// 메소드
	
	// setter
	public void enterHospital(Character curHero) 
	{
		this.curHero = curHero;
	}
	
	void heal() 
	{
		if(curHero.getMoney() < HEAL_PRICE) System.out.println("돈이 부족합니다.");
		else 
		{
			curHero.getAcount().setMoney(curHero.getMoney() - HEAL_PRICE);
			System.out.println("완전히 회복했습니다.");
			curHero.setHp(curHero.getMaxHp(), SkillType.HEAL);
			curHero.setMp(curHero.getMaxMp(), SkillType.HEAL);
		}
	}
	
	void buyPotion() 
	{
		if(curHero.getMoney() < POTION_PRICE) System.out.println("돈이 부족합니다.");
		else 
		{
			curHero.getAcount().setMoney(curHero.getMoney() - POTION_PRICE);
			System.out.println("포션을 구매하였습니다.");
			curHero.addItem(potion);
		}
	}
	
	// 오버라이드
	@Override
	public void printInfo() {
		System.out.println("병원입니다.");
	}

	@Override
	public void useMenu(Scanner sc) 
	{

		int choose = 0;
		while (choose != 4) 
		{
			SystemClass.menu("회복 하기", "포션 구매하기", "기계정보", "종료");
			choose = SystemClass.returnInt(sc);

			switch (choose) 
			{
			case 1:
				heal();
				break;
			case 2:
				buyPotion();
				break;
			case 3:
				printInfo();
				break;
			default : 
				choose = 4;
				break;
			}
		}
	}
}
