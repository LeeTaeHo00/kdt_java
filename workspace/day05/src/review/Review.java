package review;

// 1번 : 복습
public class Review {// 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		// printf() : 서식에 맞춰 출력하고 줄바꿈 되지 않는 출력 메소드
		
		System.out.printf("'%s' '%d' '%f' '%s'\n", "hello", 2025, 6.17, true); // 4가지 서식 지정자를 순서대로 출력
		System.out.printf("'%-7.2s' '%-5d' '%10f' '%-5s'\n", "hello", 2025, 6.17, true); // 4가지 서식 지정자를 순서대로 출력
		
		// 변수
		byte num1 = 5; // num1이라는 byte 자료형 변수에 5 라는 값을 대입
		byte num2 = 127; // num2이라는 byte 자료형 변수에 127 라는 값을 대입
		
		System.out.println(num1);	// println 내에 내용 출력
		System.out.println(num2);	// println 내에 내용 출력
		
		int num3 = 128;			//num3이라는 int 자료형 변수에 128 라는 값을 대입
		byte num4 = (byte)num3;		//num4이라는 byte 자료형 변수에 num3 라는 값을 강제 형변환
		
		System.out.println(num4); // println 내에 내용 출력
		
	} // main 메소드 끝
} // 클래스 끝
