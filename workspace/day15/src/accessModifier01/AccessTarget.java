package accessModifier01;

public class AccessTarget {

	// 기본 생성자
	public AccessTarget() {
		System.out.println("퍼블릭 생성자");
	}

	protected AccessTarget(String str) {
		System.out.println("protected 생성자 : " + str);
	}
	
	AccessTarget(int num)
	{
		System.out.println("default 생성자 : " + num);
	}
	
	private AccessTarget(double num) 
	{
		System.out.println("default 생성자 : " + num);
	}
	
	public void publicMethod() 
	{
		System.out.println("public Method");
	}
	
	protected void protectedMethod() 
	{
		System.out.println("protectedMethod");
	}
	
	void defaultMethod() 
	{
		System.out.println("defaultMethod");
	}
	
	private void privateMethod() 
	{
		System.out.println("privateMethod");
	}

}
