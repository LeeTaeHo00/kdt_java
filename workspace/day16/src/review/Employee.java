package review;

public class Employee extends Person{

	public Employee(String name) {
		super(name);
	}

	// 오버라이딩
	@Override
	void introduce() {
		System.out.println("저의 이름은 " + this.getName() + "이고 회사원입니다.");
	}
	
	// 고유 메소드
	void work() 
	{
		System.out.println("업무 처리중");
	}
	
	

}
