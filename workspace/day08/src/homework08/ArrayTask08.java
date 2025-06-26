package homework08;

import java.util.Scanner;

public class ArrayTask08 {

	public static void main(String[] args) {

		// 로직구성
		// 0. 입력클래스 선언 및 임포트
		// 1. 크기가 5인 정수형 참조형 변수 선언
		// 2. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 3. for문 안 실행문에서 참조형 변수 를 i 를 이용하여 각 저장공간에 입력메소드를 사용하여 값을 대입
		// 4. for문선언 (초기값 i = 0, 조건식 i < ary.length, 증감식 i++)
		// 4-1) for문선언 (초기값 j = 0, 조건식 j < ary.length - i, 증감식 j++)
		// 4-2) 제어문 안에 i인덱스에 해당하는 ary 값과 j에 해당하는 ary값을 비교하여
		// 4-3) 더 큰것을 앞 인덱스에 넣고 작은 값을 j 인덱스에 넣어 주는 코드 작성
		// 5. 0번째 인덱스와 마지막 인덱스 출력

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("수를 입력해주세요 : ");
			array[i] = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < array.length; i++) 
		{
			for(int j = i; j < array.length; j++) 
			{
				if(array[i] < array[j]) 
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		
		System.out.println("최대 : " + array[0] + "최소 : " + array[array.length - 1]);

		sc.close();
	}

}
