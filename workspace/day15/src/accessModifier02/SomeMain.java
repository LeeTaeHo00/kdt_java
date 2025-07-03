package accessModifier02;

import accessModifier01.AccessTarget;

public class SomeMain {
	public static void main(String[] args) {
		System.out.println("===같은 패키지 내 접근===");

		AccessTarget a1 = new AccessTarget(); // public 생성자
		//AccessTarget a2 = new AccessTarget("와우"); // protected
		//AccessTarget a3 = new AccessTarget(5); // default
//		AccessTarget a4 = new AccessTarget(5.0);	// private
		
		a1.publicMethod();
//		a1.protectedMethod();
//		a1.defaultMethod();
//		a1.privateMethod();
		
		AccessTest test = new AccessTest();
		test.testAccess();

	}
}
