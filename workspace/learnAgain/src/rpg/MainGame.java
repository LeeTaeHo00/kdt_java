package rpg;

import java.util.Scanner;
import character.Character;
import character.ItemType;
import character.RandomSkill;
import character.SkillInfo;
import character.SkillType;
import machines.AtmMachine;
import machines.BattleMachine;
import machines.Hospital;

public class MainGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SystemClass system = new SystemClass();
		Character hero = system.createCharacter(sc);
		
		AtmMachine atm = new AtmMachine();
		Hospital hospital = new Hospital();
		BattleMachine battleArea = new BattleMachine();
		
		// 랜덤으로 스킬 1 ~ 3개 받음
		int randomSkillCount = (int)(Math.random() * 3) + 1;
		for(int i = 0; i < randomSkillCount; i++) 
		{
			RandomSkill skill = ()->
			{
				String skillName = hero.getSkills().size() + 1 + "스킬";
				int randType = (int)(Math.random() * SkillType.values().length);
				SkillType type = SkillType.values()[randType];
				
				double randValue = Math.random() * 2;
				int randMana = (int)( Math.random() * 30);
				int randCount = (int)( Math.random() * 2) + 1;
				
				SkillInfo newSkill = new SkillInfo(skillName, type, randValue, randMana, randCount);
				
				return newSkill;
			};
			
			hero.getSkills().add(skill.randomSkill());
		}
		
		
		while(true) 
		{
			hero.printInfo();
			SystemClass.menu("사냥터로", "병원", "은행", "게임종료");
			int choose = SystemClass.returnInt(sc);
			
			switch(choose) 
			{
			case 1:
				battleArea.setHero(hero);			
				battleArea.useMenu(sc);
				break;
			case 2:
				hospital.enterHospital(hero);
				hospital.useMenu(sc);
				break;
			case 3:
				atm.setCurHero(hero);
				atm.useMenu(sc);
				break;
			case 4:
			default :
				choose = 4;
				System.out.println("종료합니다");
				break;
			}
			
			if(choose == 4) break;
		}
		
		sc.close();
	}
}
