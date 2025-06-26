package typeCasting;

public class TypeCasting01 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		
		int num1 = 10; // int 형 변수 num1 선언 및 초기화
		float num2 = 6.17f;// float 형 변수 num2 선언 및 초기화
		
		long num3 = 30L;// long 형 변수 num3 선언 및 초기화
		double num4 = 6.17;// double 형 변수 num4 선언 및 초기화
		
		boolean isTrue = true; // boolean 형 변수 isTrue 선언 및 초기화
		char alpha = 'a'; // char 형 변수 alpha 선언 및 초기화
		
		System.out.println(num1); // println소괄호내 내용 출력
		System.out.println(num2);// println소괄호내 내용 출력
		System.out.println(num3);// println소괄호내 내용 출력
		System.out.println(num4);// println소괄호내 내용 출력
		System.out.println(isTrue);// println소괄호내 내용 출력
		System.out.println(alpha);// println소괄호내 내용 출력
		
		System.out.println(num1 + num3); // 정수 출력 정수 + 정수
		System.out.println(num2 + num4); // 실수 + 실수 = 실수, double이라 출력시 15자리 까지 출력, 정밀도를 채워야 하기에 많이 출력된다.
		System.out.println(num1 + num4); // 실수 + 정수 = 실수, 딱떨어져서 나오게 된다, 이럴시 실수가 입력된 값만을 계산하기에 딱떨어진다.
		
		String result1 = num1 + num3 + ""; // 다른 자료형을 그냥 문자열에 넣으려고 하면 되지않는다. 연산결과 뒤에 빈 문자열을 붙혀 강제 형변환
		String result2 = "" + num1 + num3; // 기존 문자열로 강제 형변환된 num1 값에 num2값을 문자열로 강제 형변환하여 연결한다.
		System.out.println(result1); // println소괄호내 내용 출력
		System.out.println(result2); // println소괄호내 내용 출력
		System.out.println(isTrue + ""); // println소괄호내 내용 출력 결과는 그냥 bool 을 출력한것과 같지만 이걸로 하면 문자열을 출력하게 된다.
		System.out.println(alpha + ""); // println소괄호내 내용 출력 결과는 그냥 char 을 출력한것과 같지만 이걸로 하면 문자열을 출력하게 된다.
	}// main 메소드 끝

}// 클래스 끝
