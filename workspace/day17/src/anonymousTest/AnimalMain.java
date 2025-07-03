package anonymousTest;

public class AnimalMain {
	public static void main(String[] args) {
		Animal dog = new Animal() 
		{
			@Override
			public void speak() {
				System.out.println("멍멍");
			} 
		}; // 내부클래스 중괄호 끝
		System.out.println(dog);
		//anonymousTest.AnimalMain$1@2ff4acd0
		//패키지명		   .클래스명	 $내부클래스 1익명클래스
		dog.speak();
		
		Animal lion = new Animal() {
			
			@Override
			public void speak() {
				System.out.println("어흥");
				
			} // 내부클래스 메소드 끝
		}; // 내부클래스 중괄호 끝
		
		System.out.println(lion);
		lion.speak();
		
	}// main 끝
}
