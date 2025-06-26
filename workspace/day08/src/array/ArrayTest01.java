package array;

public class ArrayTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// 1. 어떤값이 들어갈지 모르나 몇 칸 만들지는 알 때
		// 정수형 배열변수 number1 선언하고 크기 5칸인 배열생성
		int[] number1 = new int[5];
		
		// 2. 어떤값이 들어갈지 알때
		// 문자열 배열 변수 alpha 선언하고 a,b,c 값으로 배열생성
		String[] alpha = {"A", "B", "C"};
		
		// 3. 어떤값이 들어갈지도 모르고 몇 칸 만들지도 모를 때
		// 실수형 number 선언
		double[] number2 = null;
		
		// 4. 배열 변수 선언 후 생성과 초기화
		// 정수형 배열 number3 선언
		// 1,2,3,4 값으로 초기화
		
		int[] number3;
		number3 = new int[] {1,2,3,4};
		
		System.out.println(number1);
		System.out.println(alpha);
		System.out.println(number2);
		System.out.println(number3);

	} // 메인 메소드 끝

} // 클래스 끝
