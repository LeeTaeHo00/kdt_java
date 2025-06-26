package classBasic2;
// 12번 : 클래스의 특징2(연관성이 있는 데이터와 기능을 한 곳에 통합
public class Rectangle {
	// 직사각형 정보와 관련된 기능
	
	// 필드
	int height; // 너비
	int width; // 높이
	
	// 메소드
	// 넓이를 계산하는 메소드(매개변수 x, 리턴값 o)
	int getArea() 
	{
		return height * width;
	}
	
	// 둘레를 계산하는 메소드(매개변수x 리턴값x) 정의
	void getPreimeter() 
	{
		System.out.println((width + height) * 2);
	}
	
}
