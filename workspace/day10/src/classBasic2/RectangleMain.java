package classBasic2;
//12번 : Rectable 클래스 main
public class RectangleMain {

	public static void main(String[] args) {
		//객체화
		// 클래스자료형 객체명 = new 생성자();
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		// 객체명.필드명 = 값;
		r1.height = 20;
		r1.width = 10;
		
		// 넓이 구하는 메소드 호출 (매개변수 x, 리턴 값 o )
		System.out.println("넓이 " + r1.getArea());
		
		
		// 둘레 구하느 메소드 호출 (매개변수 x, 리턴 값 x)
		System.out.print("둘레 ");
		r1.getPreimeter();
		
	}

}
