package variable;
// 5번 : 변수와 상수의 차이
public class Variable04 { //clas 싲가
	public static void main(String[] args) { //main메소드 시작
		// student 라는 변수명으로 20이라는 값을 저장한다.		
		// MAX_STUDENT 라는 상수명으로 25라는 값을 저장한다.
		int student = 20; // student라는 int 형 변수에 20 이라는 정수를 대입
		final int MAX_STUDENT = 25; // MAX_STUDENT라는 int형 상수에 25라는 값을 대입
		
		
		// 출력
		System.out.println(student); // student라는 변수를 출력후 줄넘김
		System.out.println(MAX_STUDENT); // MAX_STUDENT라는 상수값을 출력후 줄넘김
		
		// 변수에 저장되어 있는 값을 변경
		student = 25; // student 라는 변수값을 25로 변경
		System.out.println(student); // student라는 변수 값을 콘솔값에 출력후 줄넘김
		
		// 상수에 저장되어 있는 값은 변경이 되지 않는다.
		//MAX_STUDENT = 30; 
		
		// 둘이 표기법이 다른 이유는 나중에 구분하기 쉽게 하기 위해
	} // main메소드 끝
} // 클래스 끝
