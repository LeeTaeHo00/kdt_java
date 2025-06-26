package homework08;

public class ArrayTask07 {

	public static void main(String[] args) {
		
		// 로직구성
		// 1. 크기가 26인 문자형 참조형 변수 선언
		// 2. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 3. i % 2 == 0 일경우 if~else 조건문 사용
		// 3-1) 참조형 변수 를 i 를 이용하여 각 저장공간에 i + 'a' 값을 대입
		// 3-2) 참조형 변수 를 i 를 이용하여 각 저장공간에 i + 'A' 값을 대입
		// 4. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 5. 참조형 변수를 인덱스 번호로 출력
		
		char[] array = new char[26];

		for(int i = 0; i < array.length; i++) 
		{
			if(i % 2 == 0) 
			{
				array[i] = (char) ('a' + i);								
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
