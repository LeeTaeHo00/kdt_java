package character;

public class ItemInfo {
	String itemName;
	ItemType type;
	int price;
	int stack;
	int value;
	
	public ItemInfo(String itemName, ItemType type, int price, int value) {
		super();
		this.itemName = itemName;
		this.type = type;
		this.price = price;
		this.stack = 1;
		this.value = value;
	}
	
	void addStack() 
	{
		this.stack += 1;
	}
	
	public void useCall() 
	{
		System.out.println(itemName + "을/를 사용하였습니다");
	}

	public void printInfo() 
	{
		System.out.println("아이템 이름 : " + itemName);
		System.out.println("아이템 타입 : " + type.getTypeName());
		System.out.println("아이템 가격 : " + price + "G");
		System.out.println("아이테 개수 : " + stack + "개");
	}

	// 오버라이드(오브젝트 클래스)
	@Override
	public boolean equals(Object obj) {
		boolean isSame = false;
		
		if(!(obj instanceof ItemInfo)) return isSame; 
		
		if(itemName == ((ItemInfo)obj).itemName && type == ((ItemInfo)obj).type)
		{
			isSame = true;
		}
		
		return isSame;
	}

	@Override
	public String toString() {
		return itemName + "\n아이템 타입 : " + type.getTypeName() + "\n아이템 가격 : " + price + "G" + "\n아이테 개수 : " + stack + "개";
	}
	
	
}
