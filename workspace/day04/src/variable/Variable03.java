package variable;

public class Variable03 { // 클래스 시작
	public static void main(String[] args) { // main메소드 시작
		// 1) 문자부터 시작한다.
//		int 1num = 10; 숫자부터 시작시 오류 발생
		int nu1m = 10; // nu1m 이라는 정수형 변수에 10정수 대입
		int num10 = 10; // num10이라는 정수형 변수에 10 정수 대입
//		int num10 = 0; 같은 영역 내에서 같은 이름의 변수 선언시 오류 발생
		
		// 2) 특수문자 쓸 수 없다.(_ $ 는 가능)
//		int !#@#@$ = 100; syntax error : 문법 오류
		int a$b_ = 100;		// a$b_ 이라는 정수형 변수 선언과 동시에 100으로 초기화
		int _ab$ = 100; 	// 가능하나 왠만하면 _를 맨앞에 안쓰도록 한다. 1번 규칙 우선
		
		System.out.println(a$b_); // a$b_ 이라는 int형 변수를 출력후 줄넘김
		System.out.println(_ab$); // _ab$ 이라는 int형 변수를 출력 후 줄넘김
		
		// 3) 공백 사용 불가능 (카멜 표기법, 스네이크 표기법, 파스칼 표기법)
//		String user name = "뭬아옹";
		String userName = "뭬뭬뭉"; // 카멜 표기법 : 첫단어는 소문자로 시작, 단어가 바뀔떄 대문자로 표현(낙타 등모양을 닮았음), 자바 기본 표기법, 변수 메소드 작성시 사용
		// userName 이라는 String 변수 를 만듬과 동시에 초기화
		String user_name = "뫄뫄뭉"; // 스네이크 표기법 : 첫단어는 소문자로 시작, 단어가 바뀔 때 _ 로 표현, 상수(바뀌지 않는 값) 작성시
		// user_name 이라는 String 변수 를 만듬과 동시에 초기화
		String UserName = "뮈뮈뮝";	// 파스칼 표기법 : 첫단어의 첫문자를 대문자로 시작, 단어가 바뀔 떄 대문자로 표현, 클래스명 작성시
		// UserName 이라는 String 변수 를 만듬과 동시에 초기화
		
		// 키워드(예약어) 사용불가능
//		int int = 10;
//		int for = 10;
//		int public = 10;
//		int class = 10;
//		
		//5) 되도록 소문자로 시작한다(대소문자를 구분)
		int Abc = 100; // Abc 이라는 정수형 변수에 100이라는 정수 대입
		int abc = 200; // abc라는 정수형 변수에 200이라는 정수 대입
		
		System.out.println(Abc); // Abc 넣어져있는 값 출력 후 줄넘김
		System.out.println(abc); // abc에 넣어져 있는 값을 출력 후 줄넘김
		
		// name, age, data, number, num1 ...
		
	} // main 메소드 끝
} // 클래스 끝
