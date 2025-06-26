package homework08;

import java.util.Scanner;

public class ArrayTask03 {

	public static void main(String[] args) {
		
		// 로직구성
		// 0. 입력클래스 선언 및 임포트
		// 1. 크기가 3인 정수형 참조형 변수 선언
		// 2. 최종 값을 담아줄 정수형 변수 선언 후 초기화
		// 3. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 4. for문 안 실행문에서 참조형 변수 를 i 를 이용하여 각 저장공간에 입력메소드를 사용하여 값을 대입
		// 5. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 6. 참조형 변수를 인덱스 번호로 구분하여 정수형 변수에 더해줌
		// 7. 정수형 변수에 참조형 변수의 길이를 나눠줌
		// 8. 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[3];
		int result = 0;

		for(int i = 0; i < array.length; i++) 
		{
			System.out.println("수를 입력해주세요 : ");
			array[i] = sc.nextInt();
			sc.nextLine();
		}

		for(int i = 0; i < array.length; i++) 
		{
			result += array[i];
		}
		
		result /= array.length;
		
		System.out.println(result);
		
		sc.close();
	}

}
