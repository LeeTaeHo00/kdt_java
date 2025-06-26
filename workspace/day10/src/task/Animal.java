package task;

public class Animal {

	// 필드
	String name; // 동물이름
	int age; // 나이
	String species; // 종
	
	// 메소드
	// 동물이 먹이를 먹는 메소드
	void eat(String food) 
	{
		System.out.println(name + "이 " + food + "을(를) 먹습니다.");
	}
	
	// 동물이 잠을자는 메소드
	void sleep() 
	{
		System.out.println(name + "이 잠을 잡니다.");
	}
	
// 동물이 잠을자는 메소드
	void birthDay() 
	{
		System.out.println(name + "의 " + age +"살 생일을 축하합니다.");
	}
}

