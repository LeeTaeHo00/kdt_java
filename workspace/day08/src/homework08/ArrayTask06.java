package homework08;

public class ArrayTask06 {

	public static void main(String[] args) {
		
		// 로직구성
		// 1. 크기가 5인 문자형 참조형 변수 선언
		// 2. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 3. 조건문 i >= 2 일경우
		// 3-1) 조건문 i 가 2보다 클경우 i + A +1 을 한값을 대입
		// 3-2) 아닐경우 i + A 를 형변환하여 대입
		// 4. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 5. 참조형 변수를 인덱스 번호로 출력
		
		char[] array = new char[5];

		for(int i = 0; i < array.length; i++) 
		{
			if(i >= 2) 
			{
				array[i] = (char) ('A' + i + 1);								
			}
			else 
			{
				array[i] = (char) ('A' + i);				
			}
		}

		for(int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}

}
