package oper;

public class test2 {
	
	public static void main(String[] args) {
		test2 t = new test2();
		//t.test1();
		//t.test2(50);
		
		String hi = t.test3();
		System.out.println(t.test3());
	}
	
	void test1() 
	{
		System.out.println("안뇽");
	}
	
	void test2(int test2) 
	{
		for(int i = 0; i < test2; i++) 
		{
			System.out.println("안뇽");
		}
	}
	
	String test3() 
	{
		return "안뇽";
	}

}
