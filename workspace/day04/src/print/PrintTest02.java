package print;

// 9번 : printf 출력 메소드
public class PrintTest02 { // 클래스 메소드 시작
	public static void main(String[] args) { // 메인 메소드 시작
//		
//		String name = "이태호";
//		int age = 27;
//		System.out.println("제 이름은 김영선이고, 나이는 20살 입니다.");
//		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
//		System.out.printf("제 이름은 %s이고 나이는 %d살 입니다", name, age);
		
		// 정수형
		int num1 = 200;	// int 형 정수 num1에 200이라는 정수형 변수를 대입
		System.out.printf("10진수 : %d\n", num1); // 소괄호 안에 있는 내용 출력
		System.out.printf("10진수 : %d\n", 10); // 소괄호 안에 있는 내용 출력
		System.out.printf("8진수 : %o\n", 7); // 소괄호 안에 있는 내용 출력
		System.out.printf("16진수 : %x\n", 9);// 소괄호 안에 있는 내용 출력
		System.out.printf("16진수 : %x", 32); // 16진수는 10 = A, ... 15 = F, 16 => 10
		
		// 실수형 => 타입이 정밀도에 따라 달라진다.
		System.out.printf("\n실수형 : %f", 3.145121212); // 7자리 수에서 반올림을 한다.
		// float 타입 => 소수점 이하 6자리까지 정확하게 나옴, 7자리 이상이 되면 7번째 자리에서 반올림을 한다.
		// double 타입 => 소수점 이하 15번째 자리까지 정확하게 나옴, 더 정확하게 표현을 할 수 있기 때문에, 더 많은 데이터를 정확하게 표현할 수 있기 때문에 double 타입이 기본타입니다.
		double num2 = 3.12345678912345; // double 실수형 타입 num2라는 변수에 3.12.... 실수 값을 대입
		float num3 = 3.12345678912345f; // float 실수형 타입 num3 라는 벼눗에 3.12.... 실수 값을 대입
		
		System.out.println("\n" + num2); // 소괄호 안에 있는 내용 출력
		System.out.println("\n" + num3); // 소괄호 안에 있는 내용 출력
		
		System.out.printf("실수형 2자리까지 표현 : %.4f\n", 3.12345); // 소괄호 안에 있는 내용 출력
		
		// 문자형
		System.out.printf("문자형 : %c\n", 'a'); // 소괄호 안에 있는 내용 출력
		
		// 문자열
		System.out.printf("문자열 : %s", "hello world"); // 소괄호 안에 있는 내용 출력
		String data = "hello, Java"; // data 라는 string 값에 hello java라는 문자열 대입
		
		System.out.println(data); // 소괄호 안에 있는 내용 출력
		System.out.printf("문자열 %.5s\n", data); // 소괄호 안에 있는 내용 출력
		
		// 논리형 : 형식지정자 없이 문자열과 같이 쓴다.
		System.out.printf("\n논리형 : %s", true); // 소괄호 안에 있는 내용 출력
		System.out.printf("\n논리형 : %.1s", true); // 소괄호 안에 있는 내용 출력
		
		
	} // 메인 메소드 끝
} // 클래스 메소드 끝