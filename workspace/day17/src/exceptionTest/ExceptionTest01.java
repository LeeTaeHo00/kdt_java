package exceptionTest;

// 10번 : Excetion Basic
public class ExceptionTest01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	
		try 
		{
			int result = 10 / 0;
			System.out.println(result);
		}
		
//		catch(Exception e) 
//		{
//			
//		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("0으로 나눌수 없습니다");
		}
		
	}

}
