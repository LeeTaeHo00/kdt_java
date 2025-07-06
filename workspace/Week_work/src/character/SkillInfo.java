package character;

public class SkillInfo {
	String skillName;
	private SkillType type;
	private int useMana;
	
	private int useCount;
	private double useValue;

	// 생성자
	public SkillInfo(String skillName, SkillType type, double useValue, int useMana, int useCount) {
		super();
		this.skillName = skillName;
		this.type = type;
		this.useMana = useMana;
		this.useValue = useValue;
		this.useCount = useCount;
	}

	public SkillInfo() {
		this("없음", SkillType.ATTACK, 1, 0, 1);
	}
	
	// 메서드
	public SkillType getType() 
	{
		return type;
	}
	
	
	public void castingSkill(Character user, Character target) 
	{
		if(useMana > user.getMp()) 
		{
			System.out.println("마나가 부족합니다");
			return;
		}
		
		System.out.println(user.getName() +"이/가 " + target.getName() + "에게 " + skillName + "을 사용했다!");
		System.out.println(useMana + " 만큼의 마나를 사용했다");
		
		for(int i = 0; i < useCount; i++) 
		{
			target.setHp((int)(user.getAtk() * useValue), type);
			user.setMp(user.getMp() - useMana, SkillType.ATTACK);
		}
		
		System.out.print(target.getName() + "에게 " + (int)(user.getAtk() * useValue) + "만큼 ");
		System.out.println((type == SkillType.ATTACK ? "데미지를 입혔습니다." : "Hp를 회복했습니다."));
	}

	@Override
	public String toString() {
		return skillName + "\n스킬 타입 : " + type.getTypeName() + "\n마카 코스트 : " + useMana + "\n타격 횟수 : " + useCount;
	}
	
	
}
