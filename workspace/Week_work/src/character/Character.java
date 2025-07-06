package character;

import java.util.ArrayList;

import machines.Acount;

public abstract class Character {
	// 필드
	private String name;
	ArrayList<SkillInfo> skills;
	ArrayList<ItemInfo> inven;
	Acount acount;
	
	private int def;
	private int atk;
	private int speed;
	private int hp, maxHp;
	private int mp, maxMp;
	private int exp, maxExp;
	private int level;
	private String jobName;
	private int money;
	
	// 생성자
	public Character() {}
	
	public Character(String name) 
	{
		this.name = name;
		this.skills = new ArrayList<SkillInfo>();
		this.inven = new ArrayList<ItemInfo>();

		this.exp = 0;
		this.level = 1;
		this.acount = new Acount(name, 1000);
		this.jobName = "무직";
		this.money = 0;
	}
	// 추상 메소드
	public abstract void baseAtk(Character target);

	// 메소드
	
	public void useItem(int index) 
	{		
		switch(inven.get(index).type) 
		{
		case POTION:
			setHp(inven.get(index).value, SkillType.HEAL);
			break;
			
		case TRINKET:
			setSpeed(inven.get(index).value);
			break;
			
		case ARMOR:
			setDef(inven.get(index).value);
			break;
			
		case WEAPON:
			setAtk(inven.get(index).value);
			break;
		}
		
		inven.get(index).useCall();
		
		if(inven.get(index).stack > 1) 
		{
			inven.get(index).stack -= 1;
		}
		else 
		{
			inven.remove(index);
		}
	}
	
	public void addItem(ItemInfo targetItem) 
	{
		if(inven.contains(targetItem)) 
		{
			inven.get(inven.indexOf(targetItem)).stack += 1;
		}
		else inven.add(targetItem);
	}
	
	void addSkill(SkillInfo targetSkill) 
	{
		if(skills.contains(targetSkill)) 
		{
			System.out.println("이미 있는 스킬입니다.");
		}
		else skills.add(targetSkill);
	}
	
	public void printInfo() 
	{
		System.out.println("이름 : " + this.name);
		System.out.println("직업 : " + jobName + " lv." + level);
		System.out.println("HP : " + hp + "/" + maxHp);
		System.out.println("MP : " + mp + "/" + maxMp);
		System.out.println("돈 : " + money + " G");
//		System.out.println("EXP : " + exp + "/" + maxExp);
//		System.out.println("Def : " + def);
//		System.out.println("Atk : " + atk);
//		System.out.println("Spd : " + speed);
	}
	
	


	public boolean checkDead() 
	{
		return this.hp == 0 ? true : false;
	}
	
	public void useSkill(int index, Character target) 
	{
		skills.get(index).castingSkill(this, target);
	}
	
	// 추상메소드
	public abstract void levelUp();
	
	// getter setter

	public void setMoney(int money) {
		if(money < 0) this.money = 0;
		else this.money = money;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setJobName(String jobName) 
	{
		this.jobName = jobName;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
		this.hp = maxHp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
		this.mp = maxMp;
	}
	
	void setMaxExp() 
	{
		this.maxExp = level * 100;
	}

	void setExp(int value) 
	{
		this.exp += value;
		if(this.exp > this.maxExp) 
		{
			this.level += 1;
			setMaxExp();
			levelUp();
			this.exp = 0;
		}
	}
	
	public void setHp(int value, SkillType skillType) 
	{
		int result = 0;
		if(skillType == SkillType.HEAL) 
		{
			result = this.hp + value;
			if(result > this.maxHp) result = this.maxHp;
		}
		
		else if(skillType == SkillType.ATTACK) 
		{
			result = this.hp - value;
			if(result < 0) result = 0;
		}
		this.hp = result;
	}
	
	public void setMp(int value, SkillType skillType) 
	{
		int result = 0;
		if(skillType == SkillType.HEAL) 
		{
			result = this.mp + value;
			if(result > this.maxMp) result = this.maxMp;
		}
		
		else if(skillType == SkillType.ATTACK) 
		{
			result = this.mp - value;
			if(result < 0) result = 0;
		}
		this.mp = result;
	}
	
	public int getHp() {
		return hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getMp() {
		return mp;
	}

	public int getMaxMp() {
		return maxMp;
	}
	
	public int getDef() {
		return def;
	}


	public int getAtk() {
		return atk;
	}

	public int getSpeed() {
		return speed;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getJobName() 
	{
		return jobName;
	}
	
	public Acount getAcount() 
	{
		return this.acount;
	}
	
	public ArrayList<ItemInfo> getInven()
	{
		return inven;
	}
	
	public ArrayList<SkillInfo> getSkills()
	{
		return skills;
	}
	
	public int getMoney() {
		return money;
	}
}
