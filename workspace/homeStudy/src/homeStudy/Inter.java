package homeStudy;

public interface Inter {
	void test();
	
	default void test3() 
	{
		
	}
	
	private void test4() 
	{
		
	}
	
	static int test = 0;
	int test2 = 0;
}
