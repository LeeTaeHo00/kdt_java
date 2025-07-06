package character;

public class Warrior extends Character{

	public Warrior(String name) {
		super(name);
		setMaxHp(500);
		setMaxMp(20);
		setAtk(10);
		setDef(20);
		setSpeed(5);
		setJobName("전사");
	}
	

	@Override
	public void baseAtk(Character target) {
		System.out.println("도끼로 공격합니다.");
		target.setHp(getAtk(), SkillType.ATTACK);
	}


	// 오버라이드
	@Override
	public void levelUp() {
		setMaxHp(getMaxHp() + 500);
		setMaxMp(getMaxMp() + 20);
		setAtk(getAtk() + 10);
		setDef(getDef() + 20);
		setSpeed(getSpeed() + 5);
	}
}
