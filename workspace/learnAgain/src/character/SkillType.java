package character;

public enum SkillType {
	ATTACK("공격 스킬"), HEAL("회복 스킬");
	
	String typeName;
	
	private SkillType(String typeName) 
	{
		this.typeName = typeName;
	}
	
	public String getTypeName() 
	{
		return this.typeName;
	}
}
