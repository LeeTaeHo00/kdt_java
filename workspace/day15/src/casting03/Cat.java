package casting03;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	// 메소드 오버라이딩
	@Override
	void crying() {
		// TODO Auto-generated method stub
		System.out.println("냥");
	}
}
