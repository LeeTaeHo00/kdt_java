package typeCasting;
//4 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		String data1 = "10"; // data1이라는 String 자료형 변수에 10이라는 문자열 대입
		String data2 = "abc"; // data2이라는 String 자료형 변수에 abc이라는 문자열 대입
		
		System.out.println(data1 + 1); // 문자열 + 1= > data1에 1을 연결 한것을 출력
		System.out.println(data2); // data2 출력
		
		char alpha = data2.charAt(1); // alpha 라는 char형 변수에 data2에서 2번쨰 단어를 대입
		System.out.println(alpha); // alpha출력
		
		boolean result1 = Boolean.parseBoolean("FalSe"); // result1이라는 논리형 변수에 True라는 문자열을 형변환하여 대입하여 선언
		System.out.println(result1); // result1 출력
		// 문자열이 True(대소문자 상관없음)이면 true를 반환하고, 그렇지 않으면 false를 반환
		// 그 이외의 문자이거나 숫자면 False를 반환한다.
		
	} // main 메소드 끝

} // 클래스 끝
