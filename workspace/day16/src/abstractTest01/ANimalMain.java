package abstractTest01;

public class ANimalMain {
	public static void main(String[] args) {
//		Animal ani = new Animal(); // 미완성된 클래스인 추상 클래스는 객체화 할 ㅎ수 없다.
		
		Animal dog = new Dog();
		// 상속받은 자식 클래스에서 메소드 오버라이딩 되면
		// 부모타입의 변수에 자식의 참조값을 넣어서 객체화 가능하다
		// 이름 업캐스팅
		
		Animal cat = new Cat();
		dog.crying();
		cat.crying();
	}
}
