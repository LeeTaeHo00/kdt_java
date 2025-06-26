package method;
// 7qㅓㄴ 
public class MethodOverloaing02 {
	public static void main(String[] args) {
		MethodOverloaing02 m = new MethodOverloaing02();
		
	}
	
	int add(int num1, int num2) 
	{
		return num1 + num2;
	}
	
	// 매개변수의 개수가 다름
	int add(int num1, int num2, int num3) 
	{
		return num1 + num2 + num3;
	}
	// 매개변수의 타입이 다른 add 메소드
	void add(double num1, int num2) 
	{
		System.out.println(num1 + num2);
	}
	// 매개변수의 순서가 다른 add 메소드
	void add(int num2, double num1) 
	{
		System.out.println(num1 + num2);
	}
}
