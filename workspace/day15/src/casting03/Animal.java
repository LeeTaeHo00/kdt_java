package casting03;

public class Animal {
	
	// 필드
	String name;
	int age;
	
	// 생성자
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	void crying() 
	{
		System.out.println("울어!");
	}

}
