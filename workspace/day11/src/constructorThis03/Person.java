package constructorThis03;

// this() 자기자신의 생성자 호출
public class Person {
	// 필드
	String name;
	int age;
	String job;

	public Person() {

	}

	// 매개변수 2개 생성자
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public Person(String name, int age, String job) {
//		this(name, age);
//		this.job = job;
//	}
	
	// 이름 나이 직업을 매개변수로 받는 생성자
	public Person(String name, int age, String job) {
		this(name, age);
		this.job = job;
		System.out.println("모두 호출하는 생성자");
	}
	
	// 이름 직업
	public Person(String name, String job) {
		this(name,22);
		this.job = job;
		System.out.println("이름과 직업 호출하는 생성자");
	}
	
	
	// 이름 나이
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("이름과 나이 호출하는 생성자");
	}
	
	// 이름
	public Person(String name) {
		this.name = name;
	}

	// 메소드
	// printInfo()
	void printInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 직업 : " + this.job);
	}


	// greet() 000님 안녕하세요 춫력
	void greet() {
		System.out.println(this.name + "님 안녕하세요");
	}

}
