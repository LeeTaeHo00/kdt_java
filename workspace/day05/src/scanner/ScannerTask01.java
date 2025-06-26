package scanner;

import java.util.Scanner;

public class ScannerTask01 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		// 1. 본인의 이름과 성별을 입력받고 출력하기
		// 입력 예 > 이름 이름 : 
		// 입력 예 > 성별 입력 : 
		// 출력 예 > 이름은 000 이고 00 입니다.
		
		// 로직 구성
		// 1. 입력 변수 선언
		// 2. 입력 라이브러리 임포트
		// 3. 입력받을 변수 2개 선언 name gender
		// 4. 입력 받을 내용을 알려주는 출력문 작성
		// 5. name 변수에 이름 입력 받음
		// 6. 입력 받을 내용을 알려주는 출력문 작성
		// 7. gender 변수에 성별 입력 받음
		// 5. 입력 받은 내용을 합쳐주는 출력문 작성
		
		// 선생님 로직 구성
		// 1. 입력 클래스 선언
		// 2. 입력 클래스 import
		// 3. 이름과 성별 입력 메시지
		// 4. 문자열 변수 선언(name, gender)
		// 5. 변수에 입력 메소드 사용(next())
		// 6. 결과 출력
		
//		Scanner sc = new Scanner(System.in); // 입력 메소드 선언
//		String name = "";					// 입력 받을 String 변수 선언 및 초기화
//		String genderS = "";				// 입력 받을 String 변수 선언 및 초기화
//		char gender = 'M';					// 입력 받은 String 변수를 형변환 한 값을 넣어줄 char 값 변수 선언
//		
//		System.out.println("이름을 입력해주세요(공백입력불가능)"); // 소괄호 내용 출력
//		name = sc.next(); // name에 입력 메소드로 String 값 입력
//		
//		System.out.println("성별을 입력해주세요(F or M)"); // 소괄호 내용 출력
//		genderS = sc.next(); // genderS에 입력 메소드로 String 값 입력
//		
//		gender = genderS.charAt(0); // genderS 에 입력된 문자열 값중 첫번쨰 값을 char형으로 형변환하여 대입
//		
//		System.out.printf("이름은 %s 이고 성별은 %c 입니다.", name, gender); // 소괄호 내용 출력
		
		
		// 선생님 작업
		Scanner sc = new Scanner(System.in); //입력 클래스 선언
		System.out.println("이름과 성별을 띄어쓰기로 입력하세요 : "); // 소괄호 내용 출력
		String name, gender; // 이름과 성별 문자열 변수 선언
		char gender2 = sc.next().charAt(0); // 문자열을 입력받고 해당 문자열의 0번쨰 인덱스를 문자형으로 형변환하여 대입
		name = sc.next(); // 이름에 입력 메소드 사용
		gender = sc.next(); // 성별에 입력 메소드 사용
		System.out.printf("이름은 %s 이고 성별은 %s 입니다.", name, gender); // 소괄호 내용 출력
		
		sc.close(); // 입력 메소드 종료

	} // main 메소드 끝

} // 클래스 끝
