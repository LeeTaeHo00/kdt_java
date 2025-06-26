package homework08;

public class ArrayTask01 {

	public static void main(String[] args) {
		
		// 로직구성
		// 1. 크기가 100인 정수형 참조형 변수 선언
		// 2. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 3. for문 안 실행문에서 참조형 변수 를 i 를 이용하여 각 저장공간에 i + 1값을 대입
		// 4. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 5. 참조형 변수를 인덱스 번호로 구분하여 출력
		
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) 
		{
			array[i] = i + 1;
		}

		for(int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}
