package exceptionTest;
// 13번 : throws와 throw
public class ThrowTest {
	public static void main(String[] args) 
	{
		method();
	}
	
	static void method() 
	{
		for(int i = 0; i < 10; i++) 
		{
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 500 => 0.5초, 1000 => 1초
			
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
