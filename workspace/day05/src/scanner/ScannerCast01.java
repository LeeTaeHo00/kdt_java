package scanner;

import java.util.Scanner; // Scanner 라이브러리 추가

// 5번 : 입력 클래스(Scanner)
public class ScannerCast01 {
	public static void main(String[] args) {
//		System.out.println();
//		String name = "이태호"
		
		// 입력 메소드
		// 입력 메소드를 사용하기 위해서 11번 라인의 한줄이 반드시 작성되어야 한다.
		Scanner sc = new Scanner(System.in); //  sc 라는 Scanner 레퍼런스 타입 변수 선언 및 초기화
		System.out.println("이름 입력 : "); // 소괄호 내용 출력
//		String name = sc.next(); // name 이라는 문자열 변수에 콘솔창에 입력받은 값을 String 타입으로 대입
		// next() 입력 메소드 : 입력을 받고 입력받은 값을 String 타입으로 가져오는 기능을 한다.
		// next()는 공백 이후에 문자를 인식하지 못한다. 만약 다음에 또 next가 있따면 해당 문자열을 다음 next 로 넘겨준다.
		// next()는 키보드에서 입력된 문자들을 버퍼라는 곳에 임시로 저장하게 되는데 엔터가 입력되면 버퍼를 비워주게 된다.
		// 근데 중간에 공백이 있을 경우 이 공백을 포함하여 버퍼를 채워주게 되는데
		// next()는 
		
//		System.out.println(name + "님 환영합니다."); // name에 입력받은 문자열을 출력
		
		String name1 = sc.nextLine(); // name1에 입력 받고 대입
//		String name2 = sc.next(); // name2에 입력 받고 대입
//		String name3 = sc.next(); // name3에 입력 받고 대입
		
		System.out.println(name1); // name1 출력
//		System.out.println(name2); // name2 출력
//		System.out.println(name3); // name3 출력
					// 
//		String name4= sc.nextLine(); // name4에 입력 받고 대입
//		System.out.println(name4);
	}
}
