package rpg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import character.Character;
import character.ItemInfo;
import character.Mage;
import character.Rogue;
import character.SkillInfo;
import character.Warrior;

public class SystemClass {
	// 필드
	
	// 메소드
	
	
	public Character createCharacter(Scanner sc) 
	{
		String name = "none";
		int chooseClass = 0;
		Character checker = null;
		
		System.out.println("이름을 입력 해주세요");
		name = sc.next();
		sc.nextLine();
		
		System.out.println("직업을 선택해주세요");
		menu("전사", "마법사", "도적");
		chooseClass = returnInt(sc);
		
		switch (chooseClass) 
		{
		case 1:
			checker = new Warrior(name);
			break;
		case 2:
			checker = new Mage(name);
			break;
		case 3:
			checker = new Rogue(name);
			break;
		default :
			System.out.println("이상한 값을 입력하여 전사가 선택됩니다.");
			checker = new Warrior(name);
			break;
		}
		return checker;
	}
	
	// 스태틱 메소드
	static public void sleepSeconds(int second) 
	{
		try { Thread.sleep(1000 * second);} 
		catch (InterruptedException e) { e.printStackTrace(); }
	}
	
	static public int returnInt(Scanner sc) 
	{
		int choose;
		try { choose = sc.nextInt(); }			
		catch (Exception e) { choose = 0; }
		sc.nextLine();
		return choose;
	}
	
	static public void menu(String ... menuNames) 
	{
		int count = 1;
		System.out.println("=================================");
		for(String menu : menuNames) 
		{
			System.out.println("=\t\t\t\t=");
			System.out.println("=\t" + count + ". " + menu);
			System.out.println("=\t\t\t\t");
			count++;
		}
		System.out.println("=================================");
	}
	
	static public void printList(ArrayList<ItemInfo> targetList) 
	{
		Iterator<ItemInfo> list = targetList.iterator();
		int count = 1;
		System.out.println("=================================");
		while(list.hasNext()) 
		{
			System.out.printf("%d. ", count);
			ItemInfo info = list.next();
			System.out.println(info.toString());
			count++;
		}
		System.out.println("=================================");
	}
	
	static public void printSkill(ArrayList<SkillInfo> targetList) 
	{
		Iterator<SkillInfo> list = targetList.iterator();
		int count = 1;
		System.out.println("=================================");
		while(list.hasNext()) 
		{
			System.out.printf("%d. ", count);
			SkillInfo info = list.next();
			System.out.println(info.toString());
			count++;
		}
		System.out.println("=================================");
	}
	
	// 생성자
}
