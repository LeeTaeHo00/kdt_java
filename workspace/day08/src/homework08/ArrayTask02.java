package homework08;

public class ArrayTask02 {

	public static void main(String[] args) {
		
		// 로직구성
		// 1. 크기가 10인 정수형 참조형 변수 선언
		// 2. 모두 더한 값을 담아줄 정수형 변수 선언 후 초기화
		// 3. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 4. for문 안 실행문에서 참조형 변수 를 i 를 이용하여 각 저장공간에 i + 1값을 대입
		// 5. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 6. 참조형 변수를 인덱스 번호로 구분하여 정수형 변수에 더해줌
		// 7. 결과 출력
		
		int[] array = new int[100];
		int result = 0;
		
		for(int i = 0; i < array.length; i++) 
		{
			array[i] = i + 1;
		}

		for(int i = 0; i < array.length; i++) 
		{
			result += array[i];
		}
		
		System.out.println(result);
	}

}
