package casting03;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}

	// 메소드 오버라이딩
	@Override
	void crying() {
		// TODO Auto-generated method stub
		System.out.println("멍");
	}
	
	void walk() 
	{
		System.out.println("산책!");
	}
	
	
}
