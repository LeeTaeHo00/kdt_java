package oper;

public class Test3 {
	// 필드
	int i;			// 인스턴스 변수
	String name;	// 인스턴스 변수
	boolean test;	// 인스턴스 변수
	
	static int n; 	// 스태틱 변수
	
	// 메소드
	static void print() 
	{
		System.out.println(n);
		
	}
	
	void add() 
	{
		n += 1;
	}
	
	// 생성자
	// 오버 로딩 : 같은 메소드명, 생성자 명으로 매개 변수의 수, 타입, 순서 가 다르면 기능을 다르게할수디
	public Test3() // 생략이 된거임
	{
		test = true;
		System.out.println("기본생성자");
	}
	
	public Test3(String name, int i) 
	{
		this();
		this.name = name;
		this.i = i;
		System.out.println("매개변수 생성자");
	}
	
	public Test3(boolean t) 
	{
		this("gd",0);
	}
	
}
