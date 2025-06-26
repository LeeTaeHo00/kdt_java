package forTest;

import java.util.stream.IntStream;

// 5번 : for문
public class ForTest02 { // 클래스 시작
	public static void main(String[] args) { // 메인 메소드 시작
		
		// 1부터 100까지 짝수만 출력
		// 초기식 int i = 1;
		// 조건식 i <= 100 of i< 101
		// 증감식 i++
		// 실행문 조건문으로 나눠줘서 실행
		
		// for + if
		for(int i = 1; i <= 100; i ++) // i가 1부터 시작하여 100보다 작을경우 블록문을 실행하고 1씩증가
		{// for문 시작
			if(i % 2 == 0) // 현재값 짝수 검사
			{ // 조건식 시작
				System.out.print(i + " ");// 짝수 출력
			} // 조건식 끝
		} // for문 끝
		
		System.out.println();// 줄바꿈
		
		// 조건식을 50으로 사용
		for(int i = 0; i < 50; i++)  // i가 1부터 시작하여 50보다 작을경우 블록문을 실행하고 1씩증가
		{// for문 시작
			System.out.print((i + 1) * 2 + " "); // 짝수 출력
		}// for문 끝
		
		System.out.println(); // 줄바꿈
		// for문의 초기식을 2로 사용하여 증감식 변경
		for(int i = 2; i <= 100; i+=2) // i가 2부터 시작하여 100보다 작을경우 블록문을 실행하고 2씩증가
		{// for문 시작
			System.out.print(i + " ");// 짝수 출력
		}// for문 끝
		
		System.out.println(); // 줄바꿈
		
		// 1부터 100까지의 수 중에서 짞수의 합만 구하기
		// 총합을 저장할 정수 변수 선언 및 초기화
		// for문() 	초기식 int i = 2;
		//			조건식 int i <= 100;
		//			증감식 int i += 2
		// 			블록문 
		//					{
		//						변수  += i;
		//					}
		// 변수 출력
		
		// 방법1
		int finalNum1 = 0; // 정수형 변수 선언
		for(int i = 0; i <= 100; i++)  // 초기값 i를 0로 선언하여 100보다 작거나 같을 경우 블록문을 실행하고 1를 증가시켜준다.
		{// for 문 시작
			if(i % 2 == 0) // 현재 i가 짝수인지 검사해준다.
			{
				finalNum1 += i; // 정수형 변수에 현재 i 값을 더해준다.
			}			
		}// for문 끝
		System.out.println(finalNum1); // 최종 결과 출력
		
		// 방법2
		int finalNum2 = 0; // 정수형 변수 선언
		for(int i = 1; i <= 50; i++)  // 초기값 i를 1로 선언하여 50보다 작거나 같을 경우 블록문을 실행하고 1를 증가시켜준다.
		{// for 문 시작
			finalNum2 += i * 2; // 정수형 변수에 현재 i 에 2를 곱한 값을 더해준다. finalNum2 = finalNum2 + i * 2 와 같다.
		}// for문 끝
		System.out.println(finalNum2); // 최종 결과 출력
		
		// 방법3
		int finalNum3 = 0; // 정수형 변수 선언
		for(int i = 2; i <= 100; i+=2)  // 초기값 i를 2로 선언하여 100보다 작거나 같을 경우 블록문을 실행하고 2를 증가시켜준다.
		{// for 문 시작
			finalNum3 += i; // 정수형 변수에 현재 i 값을 더해준다.
		}// for문 끝
		System.out.println(finalNum3); // 최종 결과 출력
		
		// 방법4 for문 사용하지 않기
		int finalNum4 = 50; // 변수 선언
		int sum = 2*(finalNum4 * (finalNum4 + 1)) / 2; // 변수선언하고 짝수 더하기 공식으로 초기화
		System.out.println(sum); // 출력
		
		// 방법5 스트림
		int sum1 = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum(); // 어려운거
		System.out.println(sum1); // 출력
		
	} // 메인 메소드 끝
} // 클래스 끝
