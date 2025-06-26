package whlieTest;

public class WhileTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		
		// 안녕하세요 문자열을 10번 출력
		// 조건문을 true로 작성시 무한 루프에 빠진다
		// 변수선언.
		// while( 조건식){}
		
		while(true) // 조건식이 true인 while 반복문 시작
		{
			System.out.println("안녕하세요");
			break;
		}
		
		int cnt = 0;
		while(cnt < 10) // 조건식이 cnt < 10인 while 반복문 시작
		{
			System.out.println(cnt);
			cnt ++; // cnt = cnt + 1 증감식
		}
		cnt = 0;
		while(cnt < 10) // 조건식이 cnt < 10인 while 반복문 시작
		{
			cnt ++; // cnt = cnt + 1 증감식
//			System.out.println(cnt); 	// 증감식이 출력문 다음에 작성되면 0 ~ 9 출력
										// 증감식이 출력문 전에 작성되면 1 ~ 10 출력
			System.out.println("안녕하세요");
		}
	} // 메인 메소드 끝

} // 클래스 끝
