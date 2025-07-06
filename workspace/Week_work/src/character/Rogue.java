package character;

public class Rogue extends Character{

	public Rogue(String name) {
		super(name);
		setMaxHp(100);
		setMaxMp(20);
		setAtk(10);
		setDef(1);
		setSpeed(20);
		setJobName("도적");
	}

	@Override
	public void baseAtk(Character target) {
		System.out.println("단검으로 공격합니다.");
		target.setHp(getAtk() + (int)(getSpeed() * 0.8), SkillType.ATTACK);
	}

	@Override
	public void levelUp() {
		setMaxHp(getMaxHp() + 100);
		setMaxMp(getMaxMp() + 30);
		setAtk(getAtk() + 15);
		setDef(getDef() + 1);
		setSpeed(getSpeed() + 10);
	}
}
