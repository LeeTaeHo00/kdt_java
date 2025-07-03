package review;

public class Teacher extends Person{

	public Teacher(String name) {
		super(name);
	}

	// 오버라이드
	@Override // 오버라이딩 어노테이션
	void introduce() {
		System.out.println("저는 선생님입니다");
	}
	
	
	// 고유 메소드
	void teach() 
	{
		System.out.println(getName() + "이 가르칩니다");
	}
	
}
