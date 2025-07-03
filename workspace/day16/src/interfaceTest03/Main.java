package interfaceTest03;


// 10번 : 클래스 단일 상속

class Parents
{
	void printInfo() 
	{
		System.out.println("부모클래스");
	}
}

class Parent2
{
	void printInfo2() 
	{
		System.out.println("부모 2 클래스");
	}
}

class Child extends Parents
{
	void printShow() 
	{
		System.out.println("자식 클래스");
	}
}

public class Main {
	public static void main(String[] args) {
		
	}
}
