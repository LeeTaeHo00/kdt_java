package homeStudy;

public class Main2 {
	public static void main(String[] args) {
		// 업캐스팅 부모 클래스 객체에 자식 클래스 데이터를 넣어주는 것
		Test1 walking = new Test3();
		Test1 breath = new Test2();
		
		act(walking);
		act(breath);
	}
	
	static void act(Test1 test) 
	{
		if(test instanceof Test2) 
		{
			((Test2)test).breath();
		}
		
		else if(test instanceof Test3) 
		{
			((Test3)test).walking();
		}
	}
}
