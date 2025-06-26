package print;

// 7 escape 문자
public class EscapeCharacter { // 클래스 시작
	public static void main(String[] args) { // main 메소드 싲가
		// \ -> 이스케이프 문자는 문자열 안에서 \를 이용하여 작성한다.
		// "\n" "\t" "\'" "\"" "\\" 를 표현한다.
		// 줄바꿈	탭	작음따음표	큰따음표	백슬래시표현
		
		// 줄바꿈 : \n
		System.out.println("안녕하세요 \n\n4일차 수업중입니다."); // 소괄호 안에있는 내용 출력
		System.out.println("안녕하세요.");						// 소괄호 안에 있는 내용 출력
		System.out.println("4일차 수업중입니다.");				// 소괄호 안에 있는 내용 출력 
		System.out.println("지금은\n 이스케이프\n 문자 배우는\n 중입니다.");	// 소괄호 안에 있는 내용 출력
		
		// 탭 간격 : \t 탭은 현재 글자 수 대비 다르게 나올수있다.
		System.out.println("이름 : 김영선, 나이 : 20살"); // 소괄호 안에 있는 내용 출력
		System.out.println("이름 : 김영선\t 나이 : 20살");// 소괄호 안에 있는 내용 출력
		System.out.println("자바는 정말 재미있다. 자바 2일차!");// 소괄호 안에 있는 내용 출력
		System.out.println("자바는 정말 재미있다\t자바 2일차!"); // 소괄호 안에 있는 내용 출력
		System.out.println("자바는 정말 재미있다\t\t자바 2일차!"); // 소괄호 안에 있는 내용 출력
		
		// 문자열 안에서 ' 혹은 " 로 강조할 수 있다. : \', \"
		System.out.println("오늘 날씨는 흐림입니다.");// 소괄호 안에 있는 내용 출력
		System.out.println("오늘 날씨는 비가 옵니다.");// 소괄호 안에 있는 내용 출력
		
		System.out.println("오늘 날씨는 \"흐림\"입니다.");// 소괄호 안에 있는 내용 출력
		System.out.println("오늘 날씨는 '비'가 옵니다.");// 소괄호 안에 있는 내용 출력
		
		// 역슬래시 : \\
		
		System.out.println("워크스페이스 경로는 D:\\web_0900_lth입니다.");// 소괄호 안에 있는 내용 출력
		
		// 복합사용
		System.out.println
		("문자열 안에서 다양한 제어문자를 표현할 수 있따.\n \"\\n\" 을 쓰면 줄바꿈이 된다." + "\n\t\'\\t\'을 쓰면 탭키가 적용된다.");// 소괄호 안에 있는 내용 출력
	} // main 메소드 끝
} // 클래스 끝
