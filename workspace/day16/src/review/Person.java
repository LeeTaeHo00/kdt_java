package review;

public class Person {
	// 필드
	private String name;
	private int age;
	private String birth;
	
	// alt + shift + a = 그리드 모드
	
	// 생성자
	public Person(String name) {
		super();
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}
	
	// 메소드
	void introduce() 
	{
		System.out.println("이름 : " + this.getName() + "이고, 나이는 " + this.getAge() + "살 입니다.");
	}
	
	
}
