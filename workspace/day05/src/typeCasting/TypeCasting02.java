package typeCasting;

// 3번 : 문자열 자료형 -> 다른 기본 자료형
public class TypeCasting02 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		// 기본자료형 -> 문자열 자료형
		String str1 = 3 + ""; // str1이라는 String자료형에 3 이라는 정수를 형변환하여 대입
		String str2 = 6.17 + ""; // str2이라는 String자료형에 6.17 이라는 실수를 형변환하여 대입
		String str3 = 'a' + ""; // str3이라는 String자료형에 'a' 이라는 문자를 형변환하여 대입
		String str4 = true + ""; // str4이라는 String자료형에 true 이라는 논리형을 형변환하여 대입
		
		System.out.println(str1); // println 소괄호 내 내용 출력
		System.out.println(str2); // println 소괄호 내 내용 출력
		System.out.println(str3); // println 소괄호 내 내용 출력
		System.out.println(str4); // println 소괄호 내 내용 출력
		
		// 문자열 -> 기본자료형
		int number1 = Integer.parseInt(str1); // number1 이라는 int형 변수에 str1이라는 문자열을 형변환하여 대입
		System.out.println(number1); // println 소괄호 내 내용 출력
		
		double number2 = Double.parseDouble(str2); // number2 이라는 double형 변수에 str2이라는 문자열을 형변환하여 대입
		System.out.println(number2); // println 소괄호 내 내용 출력
		
		boolean isTrue2 = Boolean.parseBoolean(str4); // isTrue2 이라는 boolean형 변수에 str4이라는 문자열을 형변환하여 대입
		System.out.println(!isTrue2); // println 소괄호 내 내용 출력
		
		char ch = "hello".charAt(0); // ch 이라는 char형 변수에 hello의 첫 번째 글자를 대입
		System.out.println(ch);  // println 소괄호 내 내용 출력
		
	} // main 메소드 끝
} // 클래스 끝
