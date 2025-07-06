package character;

public class Mage extends Character{

	public Mage(String name) {
		super(name);
		setMaxHp(300);
		setMaxMp(100);
		setAtk(20);
		setDef(5);
		setSpeed(4);
		setJobName("마법사");
	}

	@Override
	public void baseAtk(Character target) {
		System.out.println("지팡이로 칩니다.");
		target.setHp(getAtk() / 2, SkillType.ATTACK);
	}

	@Override
	public void levelUp() {
		setMaxHp(getMaxHp() + 100);
		setMaxMp(getMaxMp() + 50);
		setAtk(getAtk() + 30);
		setDef(getDef() + 3);
		setSpeed(getSpeed() + 1);
	}

}
