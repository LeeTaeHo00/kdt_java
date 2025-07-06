package character;

public enum ItemType {
	POTION("포션",0), WEAPON("무기",1), ARMOR("갑옷",2), TRINKET("장식구",3);
	
	String typeName;
	int typeNum;
	
	private ItemType(String typeName, int typeNum) {
		this.typeName = typeName;
		this.typeNum = typeNum;
	}
	
	public String getTypeName() 
	{
		return this.typeName;
	}
}
