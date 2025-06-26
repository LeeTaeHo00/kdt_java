package print;
// 8번 : 출력 메소드 println, print
public class PrintTest01 // 클래스 시작
{
	public static void main(String[] args) // main 메소드 시작
	{
		// println() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈
		System.out.println("\" println은 출력 메소드이다. \"");// 소괄호 안에 있는 내용 출력
		System.out.println("자동으로 줄바꿈 된다.\n");// 소괄호 안에 있는 내용 출력
		
		// print() : 소괄호 안에 있는 값을 콘솔창에 출력하고 줄바꿈 되지 않는다.
		System.out.print("\' print() \'도 출력 메소드");// 소괄호 안에 있는 내용 출력
		System.out.print("자동으로 줄바꿈되지 않는다.\n");// 소괄호 안에 있는 내용 출력
		
		System.out.println("Java  수업중입니다.");// 소괄호 안에 있는 내용 출력
		System.out.println("지금 3시 11분입니다.");// 소괄호 안에 있는 내용 출력
	} // main 메소드 시작
} // 클래스 끝
