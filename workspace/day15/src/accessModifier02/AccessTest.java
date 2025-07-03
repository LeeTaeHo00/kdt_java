package accessModifier02;

import accessModifier01.AccessTarget;

public class AccessTest extends AccessTarget{

	public AccessTest() {
		super();
		super.protectedMethod(); // 상속 통해 접근 가능
		this.protectedMethod(); // 현재 클래스의 객체 통해 접근 가능
//		super.privateMethod(); 
	}
	
	public void testAccess() 
	{
//		AccessTarget at = new AccessTarget("hi"); 생성자(객체)로는 접근 불가
		this.protectedMethod(); // 상속을 통해서 접근해야한다.
	}
}
