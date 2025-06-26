package method;
// 높은 재사용성
public class MethodBasic02 {

	public static void main(String[] args) {
		// 동일한 로직을 구현하기 위해 새롭게 코드를 작성할 필요없이
		// 이미 작성된 메소드를 호출하면 된다.
		// 작성된 코드의 재사용성을 높일 수 있따.
		
		MethodBasic02 m = new MethodBasic02();
		
		System.out.println("첫번째 직사각형의 넓이 = " + m.claculateArea(50, 20));
		
	}
	
	int claculateArea(int width, int height) 
	{
		return width * height;
	}
}
