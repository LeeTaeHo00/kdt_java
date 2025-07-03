package interfaceTest04;

public interface Inter2 {
	default void printText() 
	{
		System.out.println("Inter2 printText() 호출");
	}
}
