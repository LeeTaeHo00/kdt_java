package exceptionTest;
// 11번 : Exception Basic
public class ExceptionTest02 {
	public static void main(String[] args) {
		ExceptionTest02 et = new ExceptionTest02();
		
		et.printLength("test");
//		et.printLength(1.5);
		//java.lang.Error -> 문법 오류
		
		try 
		{
			et.printLength(null);
		}
		catch(NullPointerException e) 
		{
			System.out.println("글자를 입력해주세요");
		}
		finally 
		{
			System.out.println("프로그램 실행 종료");
		}
	}
	
	public void printLength(String data) 
	{
		int result = data.length();
		System.out.println("글자수 : " + result);
	}
}
