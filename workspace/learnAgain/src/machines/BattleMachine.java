package machines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import character.Character;
import character.ItemInfo;
import character.ItemType;
import character.Monster;
import character.SkillType;
import rpg.SystemClass;

public class BattleMachine implements MachineBaseFunc{

	// 필드
	ArrayList<Character> monsters;
	Character hero;
	
	boolean playerAct = false;
	
	// 메소드
	
	public void setHero(Character hero) 
	{
		this.hero = hero;
		monsters = new ArrayList<Character>();
	}
	
	private void makeMonsteres() 
	{
		int randomNum = (int)(Math.random() * 3) + 1;
		for(int i = 0; i < randomNum; i++) 
		{
			Monster monster = new Monster();
			monsters.add(monster);
		}
	}

	@Override
	public void printInfo() {
		System.out.println("사냥하는 장소 입니다.");
	}

	@Override
	public void useMenu(Scanner sc)
	{
		while(true) 
		{
			SystemClass.menu("사냥 하기", "상태 확인", "아이템 사용", "돌아가기");
			int choose = SystemClass.returnInt(sc);
			
			switch (choose) {
			case 1:
				System.out.println("사냥을 시작합니다.");
				makeMonsteres();
				useFightMenu(sc);
				break;
			case 2:
				hero.printInfo();
				SystemClass.printList(hero.getInven());
				SystemClass.sleepSeconds(1);
				break;
			case 3:
				useItemMenu(sc);
				break;
			case 4:
				System.out.println("마을로 돌아갑니다.");
				return;
			default:
				System.out.println("마을로 돌아갑니다.");
				return;
			}
		}
		
	}
	
	private void useFightMenu(Scanner sc) 
	{	
		while(!isWin()) 
		{
			playerAct = false;
			printMonsterStaus();
			hero.printInfo();
			
			SystemClass.menu("기본공격", "스킬 고르기", "아이템 사용", "도망가기");
			int choose = SystemClass.returnInt(sc);	
			
			switch(choose) 
			{
			case 1:
				useAttackMenu(sc, 0);
				break;
			case 2:
				useSkillMenu(sc);
				break;
			case 3:
				useItemMenu(sc);
				break;
			default:
				System.out.println("올바른 값을 입력해주세요");
				break;
			}
			
			// 플레이어가 행동을 했다면 적들도 행동
			if(playerAct) 
			{
				Iterator<Character> iter = monsters.iterator();
				while(iter.hasNext()) 
				{
					Character monster = iter.next();
					if(monster.checkDead() == false) monster.baseAtk(hero);
				}
			}
			
			if(hero.checkDead()) break;
			else if(choose == 4) break;
		}// while문 끝
		
		if(isWin()) 
		{
			System.out.println("승리하였습니다.");
			getReward();
		}
		else 
		{
			System.out.println("패배하여 사냥터로 돌아갑니다.");
		}
		
		monsters.clear();
	}
	
	private boolean isWin() 
	{
		for(Character monster : monsters) 
		{
			if(!monster.checkDead()) 
			{
				return false;
			}
		}
		return true;
	}
	
	private void printMonsterStaus() 
	{
		System.out.print("이름 : ");
		for(int i = 0; i < monsters.size(); i++) 
		{
			System.out.print("\t" + (i + 1) + ". " + monsters.get(i).getName());
		}
		System.out.println();
		
		System.out.print("종족 : ");
		for(int i = 0; i < monsters.size(); i++) 
		{
			System.out.print("\t" + monsters.get(i).getJobName());
		}
		System.out.println();
		
		System.out.print("HP : ");
		for(int i = 0; i < monsters.size(); i++) 
		{
			System.out.print("\t" + monsters.get(i).getHp() + "/" + monsters.get(i).getMaxHp());
		}
		System.out.println();
	}
	
	// 스킬 사용
	private void useSkillMenu(Scanner sc) 
	{
		if(hero.getSkills().size() != 0) SystemClass.printSkill(hero.getSkills());
		else System.out.println("비어있음");
		
		int choose = SystemClass.returnInt(sc);	
		
		if(choose > hero.getSkills().size() || choose < 1) System.out.println("올바른 값을 입력해 주세요");
		else 
		{
			useAttackMenu(sc, choose);
		}
		
	}
	
	// 기본 공격
	private void useAttackMenu(Scanner sc, int skillNum) 
	{
		printMonsterStaus();
		
		int choose = SystemClass.returnInt(sc);
		
		if(choose > monsters.size() || choose < 1) System.out.println("이전 메뉴로 돌아갑니다.");
		else 
		{
			if(skillNum == 0) 
			{
				hero.baseAtk(monsters.get(choose - 1));
			}
			
			else 
			{
				if(hero.getSkills().get(skillNum - 1).getType() == SkillType.ATTACK) 
				{
					hero.useSkill(skillNum - 1, monsters.get(choose - 1));
				}
				else 
				{
					System.out.println("회복스킬은 자신에게 사용합니다!");
					hero.useSkill(skillNum - 1, hero);
				}
			}
			
			playerAct = true;
		}
	}
	
	// 아이템 사용
	private void useItemMenu(Scanner sc) 
	{
		if(hero.getInven().size() != 0) SystemClass.printList(hero.getInven());
		else System.out.println("비어있음");
		
		int choose = SystemClass.returnInt(sc);	
		
		if(choose > hero.getInven().size() || choose < 1) System.out.println("이전 메뉴로 돌아갑니다.");
		else 
		{
			hero.useItem(choose - 1);
			playerAct = true;
		}
	}
	
	// 전리품
	void getReward() 
	{
		int randMonster = (int)(Math.random() * monsters.size()) + 1;
		FindItem newItem = ()->
		{
			String itemName = monsters.get(randMonster).getName() + "의 전리품";
			int randItem = (int)(Math.random() * ItemType.values().length);
			ItemType type = ItemType.values()[randItem];
			
			ItemInfo item = new ItemInfo(itemName, type, monsters.get(randMonster).getMaxHp(), monsters.get(randMonster).getAtk());
			return item;
		};
		
		for (int i = 0; i < randMonster; i++) 
		{
			hero.addItem(newItem.findItem());			
		}
		hero.setMoney(hero.getMoney() + randMonster * 500);
	}
}
