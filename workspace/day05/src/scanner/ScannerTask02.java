package scanner;

import java.util.Scanner; // 입력 클래스 임포트

public class ScannerTask02 { // 클래스 시작

	public static void main(String[] args) { //main 메소드 시작

		// 1. 줄 단위로 입력받아 출력하기(입력은 3번, 출력은 1번 사용)
		// 입력1 > 자바는
		// 입력2 > 객체지향
		// 입력3 > 언어 입니다.
		// 출력 : 
		// 자바는 
		// 객체지향 
		// 언어 입니다.
		
		// 2. 이름과 나이, 취미 를 순서대로 입력받기 (입력메소드 이름과 취미 nextLine()사용, 나이는 next() 사용), 출력시 printf사용, 형변환 적용해서 출력할 것
		// 이름입력 : 
		// 나이입력 : 
		// 취미 입력 : 
		// [출력]
		// 홍길동은 20살이고 취미는 여행입니다.
		
		// 줄단위로 입력받아 출력하기
		// 1. 입력 메소드 선언
		// 2. 입력 메소드 헤더 임포트]
		// 3. 입력을 받을 변수 선언 String 1 2 3
		// 4. 입력해야 할 정보를 알려주는 출력문 작성
		// 5. 변수에 입력 메소드 사용
		// 6. 출력 메소드 사용하여 출력
		
		Scanner sc = new Scanner(System.in); //입력 메소드 선언
		System.out.println("3 문장을 순서대로 입력하세요");
		String line1 = sc.nextLine(), line2 = sc.nextLine(), line3 = sc.nextLine(); // 입력을 받을 변수 선언 String 1 2 3 후 입력 메소드 사용
		System.out.printf("%s \n%s \n%s \n", line1, line2, line3); // 소괄호 안에있는 내용 출력
		
		// 2. 이름과 나이, 취미 를 순서대로 입력받기
		// 1. 입력 메소드 선언
		// 2. 입력 메소드 헤더 임포트
		// 3. 입력을 받을 String 변수 이름 나이 취미 선언
		// 4. 변수에 입력 메소드 사용
		// 5. 입력 받은 정보를 형변환하여 받아줄 변수 ageInt 선언
		// 6. ageInt 변수에 나이를 형변환하여 대입
		// 7. printf 를 사용하여 출력
		// +) next 다음 nextline 을 사용해야 할 경우 버퍼를 한번 처리해줘야한다(next에서 줄바꿈과 공백을 해결해주지 않느다.)
		
		String name, age, hobby; //입력을 받을 String 변수 이름 나이 취미 선언
		System.out.println("이름을 입력해 주세요");// 소괄호 안에있는 내용 출력
		name = sc.nextLine();// 변수에 입력 메소드 사용
		
		System.out.println("취미를 입력해 주세요");// 소괄호 안에있는 내용 출력
		hobby = sc.nextLine();// 변수에 입력 메소드 사용
		
		System.out.println("나이를 입력해 주세요");// 소괄호 안에있는 내용 출력
		age = sc.next(); // 변수에 입력 메소드 사용
		int ageInt = Integer.parseInt(age); // 입력 받은 정보를 형변환하여 받아줄 변수 ageInt 선언 및 형변환된 값 대입
		
		System.out.printf("%s는 나이는 %d 이고, 취미는 %s 입니다.\n", name, ageInt, hobby);// 소괄호 안에있는 내용 출력
		System.out.printf("%s는 2026년에 %d 입니다.", name, ageInt + 1);// 소괄호 안에있는 내용 출력
		
		sc.close(); // 입력 메소드 종료
		
	} // main 메소드 끝

} // 클래스 끝
