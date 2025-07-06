package character;

public class Monster extends Character{

	String[] monsterName = {"햄버거", "피자", "치킨", "불닭볶음밥", "계란후라이"};
	String[] monsterType = {"슬라임", "드래곤", "하피", "스켈레톤", "늑대"};
	
	@Override
	public void baseAtk(Character target) {
		// TODO Auto-generated method stub
		System.out.println(getName() + "이 공격합니다!");
		target.setHp(getAtk(), SkillType.ATTACK);
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		System.out.println("이친구는 레벨업 없음");
	}

	public Monster() {
		super("");
		randomMonsterMaker();
	}
	
	void randomMonsterMaker() 
	{
		String name = monsterName[(int)(Math.random() * monsterName.length)];
		String typeName = monsterType[(int)(Math.random() * monsterType.length)];
		
		setName(name);
		setJobName(typeName);
		setAtk((int)(Math.random() * 10 + 1));
		setDef((int)(Math.random() * 10 + 1));
		setSpeed((int)(Math.random() * 10 + 1));
		setMaxHp((int)(Math.random() * 100 + 1));
	}
}
