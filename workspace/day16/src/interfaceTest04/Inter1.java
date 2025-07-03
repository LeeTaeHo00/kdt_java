package interfaceTest04;
// 14번 : 다중상속
public interface Inter1 {
	default void printText() 
	{
		System.out.println("Inter1 printText() 호출");
	}
}
