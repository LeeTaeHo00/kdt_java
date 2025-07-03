package accessModifier03;

public class Person {
	// 필드
	private String name;
	private int age;
	
	
	
	
	
	// getter 메소드 : name 필드의 값을 반환(리턴)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter 메소드 : name 필드 값을 설정(매개변수)
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void printInfo() 
	{
		System.out.println("이름 : " + this.name);
	}
	
	
}
