package casting04;

public class Hero {
	private String name;

	// 생성자
	public Hero(String name) {
		super();
		this.name = name;
	}

	// getter 메소드
	public String getName() {
		return name;
	}
	
	// 메소드
	
	void superPower() 
	{
		System.out.println(this.name + "이/가 슈퍼파워를 사용합니다.");
	}
	
	void say() 
	{
		System.out.println(this.name + "이/가 대사를 외칩니다.");
	}
	
	
}
