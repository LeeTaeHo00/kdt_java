package abstractTest01;

public abstract class Animal {
	//필드
	String name;
	int age;
	
	// 추상
	abstract void crying();
	
	// 일반
//	void crying() 
//	{
//		System.out.println(this.name + "이/가 운다.");
//	}
}	
