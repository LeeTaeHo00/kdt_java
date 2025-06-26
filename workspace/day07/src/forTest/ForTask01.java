package forTest;

public class ForTask01 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// for문 사용
		// 1. 100부터 1까지 추력(tab키로 띄어쓰기)
		// 2. 구구단 3단만 출력
		// 3. A ~ F 출력 (초기식 char)
		// 4. A ~ F 출력 (초기식 int i = 0)
		// 5. aBcDeFgHiJkLmNoPqRsTuVwXyZ
		
		// for문 사용
		// 초기값 : int i = 100
		// 조건식 : i > 0;
		// 증감식 : i--
		// 실행문 : i 출력
		
		for(int i = 100; i > 0; i--) // 정수형 i가 100부터 시작하여 0보다 클 경우 실행문을 실행하고 i 를 1씩 증가시킨다.
		{// for문 시작
			System.out.print(i + " "); // 출력
		}// for문 끝
		
		System.out.println("\n");
		// for문 사용
		// 초기값 : int i = 1
		// 조건식 : i < 10;
		// 증감식 : i++
		// 실행문 : i * 3 출력
		
		int dan = 3; // 변수 선언
		
		for(int i = 1; i < 10; i++) // 정수형 i가 10부터 시작하여 10보다 작을 경우 실행문을 실행하고 i 를 1씩 증가시킨다.
		{// for문 시작
			System.out.print(dan + " * " + i + " = " + i * dan + " ");
			System.out.println();
		}
		
		System.out.println();
		// for문 사용
		// 초기값 : char i = A
		// 조건식 : i <= Z0;
		// 증감식 : i--
		// 실행문 : 
		
		for(char i = 'A'; i <= 'Z'; i++) // 단어형 i가 A부터 시작하여 Z보다 작을(아스키코드)경우 실행문을 실행하고 i 를 1씩 증가시킨다.
		{// for문 시작
			//System.out.print((int)i + " ");
			System.out.print(i + " ");
		}// for문 끝
		
		System.out.println();
		// for문 사용
		// 초기값 : int i = 100
		// 조건식 : i > 0;
		// 증감식 : i--
		// 실행문 : 
		
		for(int i = 0; i <= 25; i++) // 정수형 i가 0부터 시작하여 25보다 작을경우 실행문을 실행하고 i 를 1씩 증가시킨다.
		{ // for문 시작
			char num = (char) (65 + i);
			System.out.print(num + " "); // 결과 출력
		}// for문 끝
		
		System.out.println();
		// for문 사용
		// 초기값 : int i = 100
		// 조건식 : i > 0;
		// 증감식 : i--
		// 실행문 : 
		
		for(int i = 0; i < 26; i++) // 정수형 i가 0부터 시작하여 26보다 작을경우 실행문을 실행하고 i 를 1씩 증가시킨다.
		{	// for문 시작	
			char num = i % 2 == 0 ? (char) (97 + i) : (char) (65 + i); // 삼항연산자을 이용하여 다른 결과 출력
			
			System.out.print(num + " "); // 결과 출력
		}// for문 끝
		
		// 첫번째 반복문
		// 초기식 i 가 0 조건식 0 < 26 true, 중괄호 영역, 증감식 i++
		// 현재 i값 = n, 조건식 1 < 26 true, 중괄호 영역, 증감식 i++
		//
		// 현재 i값 = 25 조건식 25 < 26 true, 중괄호 영역, 증감식 i++
		// 현재 i값 = 26 조건식 26 < 26 false,

		
		// 모든 값이 0으로 나눠줄 수 없다.

	} // 메인 메소드 끝

} // 클래스끝
