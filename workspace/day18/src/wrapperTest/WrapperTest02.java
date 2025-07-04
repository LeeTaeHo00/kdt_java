package wrapperTest;
// 6번 : 
public class WrapperTest02 {
	public static void main(String[] args) {
		int num = 10;
		printObj(num);
		Object obj = num; // Integer
		Object obj2 = 10;
		System.out.println(obj2.toString());
	}
	
	static void printObj(Object obj) 
	{
		System.out.println(obj);
	}
}
