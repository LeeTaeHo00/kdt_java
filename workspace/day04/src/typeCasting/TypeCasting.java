package typeCasting;

// 11번 : 자동형변환
public class TypeCasting { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		// 1) 작은 자료형의 값을 큰 자료형으로 변환
		// int -> long, 4 -> 8
		int iVal = 100; // iVal이라는 정수형 변수에 100이라는 정수 대입
		long result1 = iVal;	// int 형 값 100을 long 타입 변수에 대입(자동형변환)
		System.out.println(iVal); // iVal 내용 출력
		System.out.println(result1); //result 1 내용 출력
		
//		long lVal = 100L;
		
		// int -> float
		float result2 = iVal; // result2 라는 실수형 변수에 ival 이라는 정수형 변수 대입
		System.out.println(result2); // 형변환된 result2 값 출력
		
		// int -> double 4 -> 8
		double result3 = iVal; // result3 라는 실수형 double 변수에 iVal이라는 int형 변수를 형변환하여 넣어준다.
		System.out.println(result3); // 형변환된 result3 값 출력
		
		// double -> long 8 -> 8
//		long result4 = (long)result3;
		// result3은 100.0 실수 타입으로 정수형 변수에 담길 경우 손실이 발생하므로 자동형변환 불가능
		
		// float (4byte) -> double(8byte)
		double result4 = result2; // double 형 변수 result4 에 result2라는 float 형 변수를 형변환하여 대입
//		float result5 = result3;
		// double 타입의 값은 float 타입에 담을 수 없다. 소수점의 손실이 발생하기 때문에
		// double 타입 : 소수점 이하 15자리까지,
		// float 타입 : 소수점 이하 6자리까지
		System.out.println(result4); // 형변환된 result4 값 출력
		
		//2) 연산시 자동 형변환
		// 정수와 실수의 연산	
		int iVal2 = 10;				// int형 변수 iVal2에 10 정수값 대입
		double dVal2 = 3.14;		// dVal2 double 형 변수에 3.14 값 대입
		System.out.println(iVal2 + dVal2); // iVal2 값 과 dVal2값을 더한 값을 출력
		
		double result6 = iVal2 + dVal2; // result6에 ival2값 과 dval2 값을 더한 형변환된 수를 대입
		System.out.println(result6); // 형변환된 result6값을 출력
		
		// 3) 문자형에서 정수형으로 변환
		char letter = 'a'; // letter 라는 char 형 변수에 a 라는 단어를 대입
		int ascii = letter; // int형 변수 acii에 letter에 넣어진 값을 형변환하여 대입
		System.out.println(letter); // letter라는 단어 출력
		System.out.println(ascii);  // ascii 라는 letter 라는 값이 형변환된 값을 넣어준 값을 출력
		
		char letter3 = 'A'; // letter3 라는 char 형 변수에 a 라는 단어를 대입
		int ascii3 = letter3; // int형 변수 acii3에 letter에 넣어진 값을 형변환하여 대입
		System.out.println(letter3); // letter3라는 단어 출력
		System.out.println(ascii3); // ascii3 라는 letter 라는 값이 형변환된 값을 넣어준 값을 출력
		
		char letter4 = '가'; // letter4 라는 char 형 변수에 a 라는 단어를 대입
		int ascii4 = letter4; // int형 변수 acii4에 letter에 넣어진 값을 형변환하여 대입
		System.out.println(letter4);// letter4라는 단어 출력
		System.out.println(ascii4); // ascii4 라는 letter 라는 값이 형변환된 값을 넣어준 값을 출력
	} // main 메소드 끝
} // 클래스 끝
