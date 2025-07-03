package interfaceTest03;

class Parent
{
	void parentMethod() 
	{
		System.out.println("부모 클래스 메소드 호출");
	}
}

interface InterfaceA
{
	void interMethod1();
}

interface InterfaceB
{
	void interMethod2();
}

class ChildHere extends Parent implements InterfaceA, InterfaceB
{

	@Override
	public void interMethod2() {
		System.out.println("InterMethod2 메소드 구현");
	}

	@Override
	public void interMethod1() {
		System.out.println("InterMethod1 메소드 구현");
	}

	@Override
	void parentMethod() {
		System.out.println("자식 클래스 메소드 오버라이읻ㅇ");
	}
	
	
	
}


public class Main4 {
	public static void main(String[] args) {
		ChildHere obj = new ChildHere();
		obj.parentMethod();
		obj.interMethod1();
		obj.interMethod2();
	}

}
