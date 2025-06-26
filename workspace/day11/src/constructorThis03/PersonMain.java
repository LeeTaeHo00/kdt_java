package constructorThis03;
// 6번 : this() 자시자신의 생성자 호출
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println();
		Person p2 = new Person("홍길동");
		System.out.println();
		Person p3 = new Person("홀길동", 5);
		System.out.println();
		Person p4 = new Person("홍길동", "학생");
		System.out.println();
		Person p5= new Person("홍길동", 20, "학생");
		System.out.println();
		
		System.out.println(p3);
		System.out.println();
		System.out.println(p5);
		System.out.println();
		
		p3.printInfo();
		p5.printInfo();
	}

}
